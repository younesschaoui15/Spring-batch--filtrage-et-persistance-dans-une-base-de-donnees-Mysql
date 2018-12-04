package Beans;

import javax.persistence.*;

@Entity
public class Personne {

	@Id
	int id;
	String prenom, nom, civilite;
	
	public Personne() {	}

	public Personne(int id, String prenom, String nom, String civilite) {
		super();
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
		this.civilite = civilite;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCivilite() {
		return civilite;
	}

	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}

	@Override
	public String toString() {
		return "id: "+id+", Prénom: "+prenom+", Nom: "+nom+", Civilité: "+civilite;
	}
	
}
