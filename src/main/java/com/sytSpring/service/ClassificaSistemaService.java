package com.sytSpring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sytSpring.dao.ClassificaSistemaRepository;
import com.sytSpring.model.Registrazione;

@Service
public class ClassificaSistemaService {
	private ClassificaSistemaRepository csr;

	@Autowired
	public ClassificaSistemaService(ClassificaSistemaRepository csr) {
		this.csr=csr;
		
	}
	
	public List<Registrazione> getClassificaSistema(){
		List<Registrazione> classifica=new ArrayList<Registrazione>();
		classifica=csr.selectTop10();
		
		return classifica;
		
	}
			
}
	