package com.virtualpairprogrammers.services;

import java.util.ArrayList;
import java.util.List;

import com.virtualpairprogrammers.dao.AscoltaDAO;
import com.virtualpairprogrammers.model.Registrazione;

public class AscoltaService {
    private AscoltaDAO ascoltaDAO;

	  public AscoltaService() {
	        this.ascoltaDAO = new AscoltaDAO();
	    }
	  public List<Registrazione> getRegistrazioni(String substring){
		  List<Registrazione> registrazioni = new ArrayList<Registrazione>();
				 registrazioni=ascoltaDAO.getAllRegistrazioni(substring);
		return registrazioni;
		  
	  }


}
