package com.virtualpairprogrammers.services;

import java.util.ArrayList;
import java.util.List;

import com.virtualpairprogrammers.dao.GiudiceDAO;
import com.virtualpairprogrammers.model.Utente;
import com.virtualpairprogrammers.services.RicercaCantanteService;

public class RicercaCantanteService {


	    private GiudiceDAO giudiceDAO;

		  public RicercaCantanteService() {
		        this.giudiceDAO = new GiudiceDAO();
		    }
		  public List<Utente> getAllCantanti(String substring){
			  List<Utente> cantanti = new ArrayList<Utente>();
					 cantanti=giudiceDAO.getAllCantanti(substring);
			return cantanti;
			  
		  }

	}


