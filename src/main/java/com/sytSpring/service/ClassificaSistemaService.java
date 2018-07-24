package com.sytSpring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sytSpring.dao.ClassificaSistemaRepository;
import com.sytSpring.model.Registrazione;


public class ClassificaSistemaService {
	private ClassificaSistemaRepository csr;

	@Autowired
	public ClassificaSistemaService() {
		
	}
	
	public List<Registrazione> getClassificaSistema(){
		List<Registrazione> classifica=new ArrayList<Registrazione>();
		classifica=csr.getClassifica();
		return classifica;
		
	}
}
