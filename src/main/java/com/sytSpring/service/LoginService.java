package com.sytSpring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sytSpring.dao.UtenteRepository;
import com.sytSpring.model.Utente;

@Service
public class LoginService {

	private UtenteRepository utenteRepository;

	@Autowired
	public LoginService(UtenteRepository utenteRepository) {
		this.utenteRepository = utenteRepository;
	}

	public Utente login(String username, String password) {
		Utente utente = utenteRepository.findByUsername(username);

		if (utente.getPassword().equals(password)) {
			return utente;
		}

		else {
			Utente error = new Utente();
			error = null;
			return error;
		}
	}
}
