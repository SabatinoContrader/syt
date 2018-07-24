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

	public String login(String username, String password) {
		Utente utente = utenteRepository.findByUsername(username);

		String risultato = "";
		if (utente == null) {
			risultato = "false";
			return risultato;
		} else {
			if (utente.getPassword().equals(password)) {
				String ruolo = utente.getRuolo();
				return ruolo;
			}

			else {
				risultato = "false";
				return risultato;
			}
		}
	}

}
