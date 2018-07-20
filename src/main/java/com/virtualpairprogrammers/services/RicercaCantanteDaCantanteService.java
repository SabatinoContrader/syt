package com.virtualpairprogrammers.services;

import java.util.ArrayList;
import java.util.List;

import com.virtualpairprogrammers.dao.CantanteDAO;
import com.virtualpairprogrammers.model.Utente;
import com.virtualpairprogrammers.services.RicercaCantanteService;

public class RicercaCantanteDaCantanteService {


	    private CantanteDAO cantanteDAO;

		  public RicercaCantanteDaCantanteService() {
		        this.cantanteDAO = new CantanteDAO();
		    }
		  public List<Utente> getAllCantanti(String substring){
			  List<Utente> cantanti = new ArrayList<Utente>();
					 cantanti=cantanteDAO.getAllCantanti(substring);
			return cantanti;
			  
		  }

	}


