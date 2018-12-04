package Batch;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Service;

import Beans.Personne;

@Service
public class PersonProcessor implements ItemProcessor<Personne, Personne>{

	public PersonProcessor() {	}

	@Override
	public Personne process(Personne p) throws Exception 
	{
		Personne per = null; 
		if(p.getCivilite().equals("M"))
			per=p;
		
		return per;
	}

}
