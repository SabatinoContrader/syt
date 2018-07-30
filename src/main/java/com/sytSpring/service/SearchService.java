package com.sytSpring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sytSpring.dao.UtenteRepository;
import com.sytSpring.model.Utente;

@Service
public class SearchService {
	
	private UtenteRepository utenteRepository;

	@Autowired
	public SearchService(UtenteRepository utenteRepository) {
		this.utenteRepository = utenteRepository;
	}
	
	public List<Utente> searchCantante(String username) {
		
		List<Utente> cantanti = new ArrayList<Utente>();
		String user = "%" + username + "%";
		String ruolo = "C";
		cantanti = utenteRepository.searchCantanti(user, ruolo);
		//cantanti=utenteRepository.findAllByUsernameAndRuolo(user, ruolo);
	
		return cantanti;
	}
}
