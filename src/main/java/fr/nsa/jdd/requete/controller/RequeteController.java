package fr.nsa.jdd.requete.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import fr.nsa.jdd.requete.model.Requete;
import fr.nsa.jdd.requete.service.RequeteService;

@RestController
public class RequeteController {

	@Autowired
	RequeteService requeteService;
	
	@GetMapping("/requetes")
	public String getAllRequetes(){
		requeteService.getAllRequete();
		return "111";
	}
	
	@GetMapping("/requetes/{id}")
	public Requete getAllRequetes(@PathVariable(value="id") Long id){
		Optional<Requete> optionalRequete=requeteService.getRequeteById(id);
		Requete requeteVide=new Requete();
		Requete requeteResultat=optionalRequete.isPresent()?optionalRequete.get():requeteVide;
		return requeteResultat;
	}
	
	
}
