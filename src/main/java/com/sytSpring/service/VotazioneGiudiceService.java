package com.sytSpring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.sytSpring.dao.VotazioneGiudiceRepository;
import com.sytSpring.dao.VotazioneSistemaRepository;
import com.sytSpring.model.VotazioneGiudice;
import com.sytSpring.model.VotazioneSistema;

@Service
public class VotazioneGiudiceService {
	private VotazioneGiudiceRepository votaRepository;
	private VotazioneSistemaRepository votaSistemaRepository;


	@Autowired
	public VotazioneGiudiceService(VotazioneGiudiceRepository votaRepository,
			VotazioneSistemaRepository votaSistemaRepository) {
		this.votaRepository = votaRepository;
		this.votaSistemaRepository = votaSistemaRepository;
	}

	public boolean insertVoto(VotazioneGiudice votazioneGiudice) {
		this.votaRepository.save(votazioneGiudice);
		return true;
	}

	public boolean insertVotoSistema(VotazioneSistema votazioneSistema) {
		this.votaSistemaRepository.save(votazioneSistema);
		return true;
	}
	
	
	public List<VotazioneGiudice> checkFlag(int idRegistrazione) {
		return votaRepository.checkFlag(idRegistrazione);
	}
	
	public void updateFlag(int idRegistrazione) {
		votaRepository.update(idRegistrazione);
		
	}
	

	public boolean updateSistema(int idRegistrazione) {
		this.votaSistemaRepository.updateSistema(idRegistrazione);
		return true;
	}

}