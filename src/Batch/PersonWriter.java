package Batch;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Beans.Personne;

@Service
public class PersonWriter implements ItemWriter<Personne>{

	private SessionFactory sessionFactory;
	
	public PersonWriter() {	}
	
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	@Override
	public void write(List<? extends Personne> liste) throws Exception 
	{
		Session s = sessionFactory.openSession();
		s.beginTransaction(); 
		for(Personne p : liste)
		{
			System.out.println(p.toString());
			s.saveOrUpdate(new Personne(p.getId(), p.getPrenom(), p.getNom(), p.getCivilite()));
		}
		
		s.getTransaction().commit();
		s.close();
		System.out.println("-- DONE --");
		
	}

}
