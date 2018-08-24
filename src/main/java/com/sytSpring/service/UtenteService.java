package com.sytSpring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sytSpring.dao.CanzoneRepository;
import com.sytSpring.dao.UtenteRepository;
import com.sytSpring.model.Canzone;
import com.sytSpring.model.Utente;

@Service
public class UtenteService {
	
	private UtenteRepository utenteRepository;

	@Autowired
	public UtenteService(UtenteRepository utenteRepository) {
		this.utenteRepository = utenteRepository;
	}
	
	public Utente caricaById(int idUtente) {

		return utenteRepository.findByidUtente(idUtente);		

	}

}
