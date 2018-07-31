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
		List<Registrazione> classifica=new ArrayList<Registrazione>();
		if(csr.selectTop10Sistema().size()<10) {
			classifica=(csr.selectTop10Sistema());
		}
		else {
			classifica=csr.selectTop10Sistema().subList(0, 10);
		}
		return classifica;
		
	}
			
}
	