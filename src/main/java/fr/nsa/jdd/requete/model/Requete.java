package fr.nsa.jdd.requete.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table (name = "requete")
public class Requete {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Getter
	@Setter
	protected Long id;
	
	@Getter
	@Setter
	protected String nom_requete;
	
	@Getter
	@Setter
	protected String desc_requete;

	
	@Override
	public String toString() {
		return "Requete: "+id+"-"+ nom_requete + "\n\tDescription: " +desc_requete;
	}
	
}
