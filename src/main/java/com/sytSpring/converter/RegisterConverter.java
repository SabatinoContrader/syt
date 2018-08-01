package com.sytSpring.converter;

import org.springframework.stereotype.Component;

import com.sytSpring.dto.RegisterDTO;
import com.sytSpring.model.Utente;
@Component
public class RegisterConverter implements Converter<Utente, RegisterDTO> {

	

	@Override
	public Utente convertToEntity(RegisterDTO registerDTO) {
		
		Utente utente=new Utente();
		utente.setNome(registerDTO.getNome());
		utente.setCognome(registerDTO.getCognome());
		utente.setEmail(registerDTO.getEmail());
		utente.setDataNascita(registerDTO.getDataNascita());
		utente.setLuogoNascita(registerDTO.getLuogoNascita());
		utente.setSesso(registerDTO.getSesso());
		utente.setGenere(registerDTO.getGenere());
		utente.setTelefono(registerDTO.getTelefono());
		utente.setRuolo(registerDTO.getRuolo());
		utente.setUsername(registerDTO.getUsername());
		utente.setPassword(registerDTO.getPassword());		
		return utente;
	}

	@Override
	public RegisterDTO convertToDTO(Utente utente) {
		RegisterDTO regDto=new RegisterDTO();
		regDto.setNome(utente.getNome());
		regDto.setCognome(utente.getCognome());
		regDto.setEmail(utente.getEmail());
		regDto.setDataNascita(utente.getDataNascita());
		regDto.setLuogoNascita(utente.getLuogoNascita());
		regDto.setSesso(utente.getSesso());
		regDto.setTelefono(utente.getTelefono());
		regDto.setUsername(utente.getUsername());
		regDto.setPassword(utente.getPassword());
		regDto.setGenere(utente.getGenere());
		regDto.setRuolo(utente.getRuolo());
		return regDto;
	}

}
