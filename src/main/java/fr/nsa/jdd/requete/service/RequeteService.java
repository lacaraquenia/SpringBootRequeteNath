package fr.nsa.jdd.requete.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.nsa.jdd.requete.model.Requete;
import fr.nsa.jdd.requete.repository.RequeteRepository;

@Service
public class RequeteService {
	
	@Autowired
	public RequeteRepository requeteRepository;
	
	public Iterable<Requete> getAllRequete(){
		return requeteRepository.findAll();
	}
	
	public Optional<Requete> getRequeteById(Long id) {
		Optional<Requete> requeteOptional=requeteRepository.findById(id);
		return requeteOptional;
	}

}
