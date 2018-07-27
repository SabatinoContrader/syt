package com.sytSpring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.sytSpring.dao.VotazioneGiudiceRepository;
import com.sytSpring.model.VotazioneGiudice;


@Service
public class VotazioneGiudiceService {
	private VotazioneGiudiceRepository votaRepository;
	
	@Autowired
	public VotazioneGiudiceService(VotazioneGiudiceRepository votaRepository) { 
		this.votaRepository = votaRepository;
	}
	public boolean insertVoto(VotazioneGiudice votazioneGiudice) {
			this.votaRepository.save(votazioneGiudice);
			return true;
	}
	
	
	public List<VotazioneGiudice> checkFlag(int idRegistrazione) {
		return votaRepository.checkFlag(idRegistrazione);
	}
	
	public void updateFlag(int idRegistrazione) {
		votaRepository.update(idRegistrazione);
		
	}
	
}