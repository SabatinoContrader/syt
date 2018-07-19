package com.virtualpairprogrammers.services;

import java.util.ArrayList;
import java.util.List;

import com.virtualpairprogrammers.dao.RegistrazioneVocaleDAO;
import com.virtualpairprogrammers.model.Registrazione;

public class RegistrazioneVocaleService {
    private RegistrazioneVocaleDAO registrazioneVocaleDAO;

	  public RegistrazioneVocaleService() {
	        this.registrazioneVocaleDAO = new RegistrazioneVocaleDAO();
	    }
	  public List<Registrazione> getRegistrazioni(String substring){
		  List<Registrazione> registrazioni = new ArrayList<Registrazione>();
				 registrazioni=registrazioneVocaleDAO.getAllRegistrazioni(substring);
		return registrazioni;
		  
	  }

}
