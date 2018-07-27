package com.sytSpring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.sytSpring.dao.VotazioneCantanteRepository;
import com.sytSpring.dao.VotazioneGiudiceRepository;
import com.sytSpring.model.VotazioneCantante;
import com.sytSpring.model.VotazioneGiudice;


@Service

public class VotazioneCantanteService {
	private VotazioneCantanteRepository votaCantanteRepository;
	private VotazioneGiudiceRepository votaGiudiceRepository;
	
	public boolean checkVoto(int idRegistrazione) {
		return votaGiudiceRepository.findByIdRegistrazione(idRegistrazione);
	}
	/*public boolean insert(VotazioneCantante vc) {
		votacantanteRepository.
		return false;
	}*/
}
