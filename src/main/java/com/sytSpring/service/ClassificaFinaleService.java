package com.sytSpring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sytSpring.dao.RegistrazioneRepository;
import com.sytSpring.model.Registrazione;

@Service
public class ClassificaFinaleService {
	private RegistrazioneRepository registrazRepo;

	@Autowired
	public ClassificaFinaleService(RegistrazioneRepository rr) {
		this.registrazRepo=rr;
	}

	public List<Registrazione> getClassificaFinale() {
		return registrazRepo.selectClassificaFinale();
	}
			
}
