package fr.nsa.jdd.requete.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import fr.nsa.jdd.requete.model.Requete;
import fr.nsa.jdd.requete.repository.RequeteRepository;

@Service
public class RequeteService {
	
	@Autowired
	public RequeteRepository requeteRepository;
	
	
	public List<Requete> getAllRequete(){
		Iterable<Requete> allRequetes=requeteRepository.findAll();
		List<Requete> listeRequetes=StreamSupport.stream(allRequetes.spliterator(), false).collect(Collectors.toList());
		return listeRequetes;
	}
	
	public Optional<Requete> getRequeteById(Long id) {
		Optional<Requete> requeteOptional=requeteRepository.findById(id);
		return requeteOptional;
	}
	
	public Optional<Requete> createRequete(Requete requete){
		Requete req=requeteRepository.save(requete);
		return Optional.of(req);
	}
}
