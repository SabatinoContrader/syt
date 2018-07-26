package com.sytSpring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.sytSpring.dao.VotazioneGiudiceRepository;
import com.sytSpring.model.VotazioneGiudice;


@Service
public class VotaService {
	private VotazioneGiudiceRepository votaRepository;
	
	
	@Autowired
	public VotaService(VotazioneGiudiceRepository votaRepository) { 
		this.votaRepository = votaRepository;
	}
	public boolean insertVoto(VotazioneGiudice votazioneGiudice) {
			this.votaRepository.save(votazioneGiudice);
			return true;
	}
	
}