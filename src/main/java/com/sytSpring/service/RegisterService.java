package com.sytSpring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.sytSpring.dao.UtenteRepository;
import com.sytSpring.model.Utente;
import com.sytSpring.model.Utente;

@Service
public class RegisterService {
	private UtenteRepository utenteRepository;
	
	
	@Autowired
	public RegisterService(UtenteRepository utenteRepository) { 
		this.utenteRepository = utenteRepository;
	}
	public Utente insert(Utente utente) {
		if (existsByUsername(utente.getUsername())) {
			return null;
		} else {
			
			return this.utenteRepository.save(utente);
		}
	}

	public boolean existsByUsername(String username) {
		return this.utenteRepository.existsByUsername(username);
	}

	
	//public boolean insert(Utente utente) {
	//	return this.registerRepository.save(utente);
	//}
}
