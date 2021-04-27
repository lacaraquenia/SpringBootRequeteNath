package fr.nsa.jdd.requete.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "requete")
public class Requete {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	protected Long id;
	
	protected String nom_requete;
	
	protected String desc_requete;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom_requete() {
		return nom_requete;
	}

	public void setNom_requete(String nom_requete) {
		this.nom_requete = nom_requete;
	}

	public String getDesc_requete() {
		return desc_requete;
	}

	public void setDesc_requete(String desc_requete) {
		this.desc_requete = desc_requete;
	}


	
}
