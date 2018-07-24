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

	public Utente insert(Utente utente) {
		return this.utenteRepository.save(utente);
	}

	public boolean pswmodify(String username, String newpassword) {

		Utente utente = utenteRepository.findByUsername(username);
		if (utente.getUsername().equals(username)) {
			utenteRepository.updateUtente(newpassword, utente.getUsername());
			return true;
		} else
			return false;

	}

}
