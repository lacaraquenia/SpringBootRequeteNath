package fr.nsa.jdd.requete.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.nsa.jdd.requete.model.Requete;
import fr.nsa.jdd.requete.service.RequeteService;

@RestController
public class RequeteController {

	@Autowired
	RequeteService requeteService;
	
//	@Value("${nsa.prop.chiffre}")
//	private String propChiffre;
	
	@Autowired
	private Environment env;
	
	Logger logger=LoggerFactory.getLogger(RequeteController.class);
	
	
	@GetMapping("/requetes")
	public List<Requete> getAllRequetes(){
		 List<Requete> listeRequetes=requeteService.getAllRequete();
		 System.out.println(env.getProperty("nsa.prop.monProfile"));
		 System.out.println("*****");
		 System.out.println(env.getProperty("nsa.prop.chiffre"));
		 String rownumbers=env.getProperty("nsa.prop.rownumbers");
		 String[] arrRowNumbers=rownumbers.split(";");
		 System.out.println("Rownumbers: " + Arrays.toString(arrRowNumbers));
		return listeRequetes;
	}
	
	@GetMapping("/requetes/{id}")
	public Requete getAllRequetes(@PathVariable(value="id") Long id){
		Optional<Requete> optionalRequete=requeteService.getRequeteById(id);
		Requete requeteVide=new Requete();
		Requete requeteResultat=optionalRequete.isPresent()?optionalRequete.get():requeteVide;
		return requeteResultat;
	}
	
	@PostMapping (value = "/requetes")
	public Requete createNewRequete(@RequestBody Requete requete){
		Optional<Requete> addedRequete=requeteService.createRequete(requete);
		Requete resultat=addedRequete.isPresent()?addedRequete.get():new Requete();
		//System.out.println(resultat);
		logger.debug(resultat.toString());
		return resultat;
	}
	
	
}
