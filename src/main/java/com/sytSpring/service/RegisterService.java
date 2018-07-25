package com.sytSpring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.sytSpring.dao.RegisterRepository;
import com.sytSpring.dao.UtenteRepository;
import com.sytSpring.model.Utente;
import com.sytSpring.model.Utente;

@Service
public class RegisterService {
	private RegisterRepository registerRepository;
	
	
	@Autowired
	public RegisterService(RegisterRepository registerRepository) { 
		this.registerRepository = registerRepository;
	}
	public boolean insert(Utente utente) {
		if (existsByUsername(utente.getUsername())) {
			return false;
		} else {
			this.registerRepository.save(utente);
			return true;
		}
	}

	public boolean existsByUsername(String username) {
		return this.registerRepository.existsByUsername(username);
	}

	
	//public boolean insert(Utente utente) {
	//	return this.registerRepository.save(utente);
	//}
}
