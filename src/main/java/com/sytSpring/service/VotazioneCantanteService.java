package com.sytSpring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.sytSpring.dao.UtenteRepository;
import com.sytSpring.dao.VotazioneCantanteRepository;
import com.sytSpring.dao.VotazioneGiudiceRepository;
import com.sytSpring.model.VotazioneCantante;
import com.sytSpring.model.VotazioneGiudice;


@Service

public class VotazioneCantanteService {
	private VotazioneCantanteRepository votaCantanteRepository;
	private VotazioneGiudiceRepository votaGiudiceRepository;
	
	@Autowired
	public VotazioneCantanteService(VotazioneCantanteRepository votaCantanteRepository,VotazioneGiudiceRepository votaGiudiceRepository) {
		this.votaCantanteRepository = votaCantanteRepository;
		this.votaGiudiceRepository = votaGiudiceRepository;
		
	}

	public void inserisciVotazioneCantante(VotazioneCantante vc) {
		votaCantanteRepository.save(vc);
		
	}

	public void updateVoti(int idRegistrazione, double orecchiabilita, double download, double media) {
		votaCantanteRepository.updateVoti(idRegistrazione,orecchiabilita,download,media);
		
	}

	

}
