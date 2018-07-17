package com.virtualpairprogrammers.services;

import java.util.ArrayList;
import java.util.List;

import com.virtualpairprogrammers.dao.GiudiceDAO;
import com.virtualpairprogrammers.model.Utente;



public class GiudiceService {

    private GiudiceDAO giudiceDAO;

	  public GiudiceService() {
	        this.giudiceDAO = new GiudiceDAO();
	    }
	  public List<Utente> getCantanti(String substring){
		  List<Utente> cantanti = new ArrayList<Utente>();
				 cantanti=giudiceDAO.getAllCantanti(substring);
		return cantanti;
		  
	  }

}


