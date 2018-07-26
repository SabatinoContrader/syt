package com.sytSpring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sytSpring.dao.RegistrazioneRepository;
import com.sytSpring.model.Registrazione;

@Service
public class ClassificaSistemaService {
	private RegistrazioneRepository csr;

	@Autowired
	public ClassificaSistemaService(RegistrazioneRepository csr) {
		this.csr=csr;
		
	}
	
	public List<Registrazione> getClassificaSistema(){
		List<Registrazione> classifica=new ArrayList<Registrazione>(csr.selectTop10Sistema().subList(0, 2));
		
		
		return classifica;
		
	}
			
}
	