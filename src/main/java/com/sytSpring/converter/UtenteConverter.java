package com.sytSpring.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.sytSpring.dto.UtenteDTO;
import com.sytSpring.model.Utente;

@Component

public class UtenteConverter implements Converter<Utente , UtenteDTO> {

	@Override
	public Utente convertToEntity(UtenteDTO utenteDTO) {
		Utente utente=new Utente();
		utente.setIdUtente(utenteDTO.getIdUtente());
		utente.setGenere(utenteDTO.getGenere());
		utente.setLivello(utenteDTO.getLivello());
		utente.setRuolo(utenteDTO.getRuolo());
		utente.setUsername(utenteDTO.getUsername());
		utente.setPassword(utenteDTO.getPassword());
		
		return utente;
	}

	@Override
	public UtenteDTO convertToDTO(Utente utente) {
	
		return new UtenteDTO(utente.getIdUtente(),utente.getGenere(),utente.getLivello(),utente.getRuolo(),utente.getUsername(),utente.getPassword());
	}

}
