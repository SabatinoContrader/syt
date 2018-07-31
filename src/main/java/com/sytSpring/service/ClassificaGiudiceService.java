package com.sytSpring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sytSpring.dao.RegistrazioneRepository;
import com.sytSpring.model.Registrazione;

@Service
public class ClassificaGiudiceService {
	private RegistrazioneRepository registrazRepo;
	
	@Autowired
	public ClassificaGiudiceService(RegistrazioneRepository registrazRepo) {
		this.registrazRepo=registrazRepo;
	}

	public List<Registrazione> getClassificaGiudice() {
		return registrazRepo.selectTop10Giudice();
	}
		
}
