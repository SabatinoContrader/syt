package com.sytSpring.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sytSpring.dao.CanzoneRepository;
import com.sytSpring.model.Canzone;

@Service

public class CanzoneService {
	
	private CanzoneRepository canzoneRepository;

	@Autowired
	public CanzoneService(CanzoneRepository canzoneRepository) {
		this.canzoneRepository = canzoneRepository;
	}
	
	public List<Canzone> listaCanzoni(int liv , String gen) {
		List<Canzone> listCanzoni = new ArrayList<Canzone>();
		listCanzoni=canzoneRepository.findAllByLivelloAndGenere(liv, gen);
		return listCanzoni;
	}
	public Canzone canzscelta(int idcanz) {
		Canzone canz = new Canzone();
		canz =canzoneRepository.findByidcanzone(idcanz);
		return canz;
	}

}
