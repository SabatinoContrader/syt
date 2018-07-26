package com.sytSpring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sytSpring.dao.RegistrazioneRepository;
import com.sytSpring.model.Registrazione;

@Service
public class RegistrazioneService {
	
	private RegistrazioneRepository registrazioneRepository;

	@Autowired
	public RegistrazioneService(RegistrazioneRepository registrazioneRepository) {
		this.registrazioneRepository = registrazioneRepository;
	}
	
	public List<Registrazione> searchRegistrazioni(String username) {
		List<Registrazione> registrazioni = new ArrayList<Registrazione>();
		registrazioni = registrazioneRepository.searchRegistrazioni(username);
		return registrazioni;
	}
}
