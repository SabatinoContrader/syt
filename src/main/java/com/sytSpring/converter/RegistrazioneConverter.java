package com.sytSpring.converter;

import org.springframework.stereotype.Component;

import com.sytSpring.dto.RegistrazioneDTO;
import com.sytSpring.model.Registrazione;
import com.sytSpring.service.CanzoneService;
import com.sytSpring.service.UtenteService;


	
	@Component

	public class RegistrazioneConverter implements Converter<Registrazione , RegistrazioneDTO> {

		
		private CanzoneService canzoneService;
		@Override
		public Registrazione convertToEntity(RegistrazioneDTO registrazioneDTO) {
			
			Registrazione registrazione=new Registrazione();
			registrazione.setIdRegistrazione(registrazioneDTO.getIdRegistrazione());
			registrazione.setDataCreazione(registrazioneDTO.getDataCreazione());
			registrazione.setIdCanzone(canzoneService.caricaById(registrazioneDTO.getIdCanzone()));
			registrazione.setIdUtente(utenteService.caricaById(registrazioneDTO.getIdUtente()));
			return registrazione;
		}

		@Override
		public RegistrazioneDTO convertToDTO(Registrazione registrazione) {
		
			return new RegistrazioneDTO(registrazione.getIdRegistrazione(),registrazione.getDataCreazione(),registrazione.getIdCanzone().getIdCanzone(),registrazione.getIdUtente().getIdUtente());
		}

	}



