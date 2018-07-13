package main.service;

import java.util.ArrayList;
import java.util.List;

import main.dao.GiudiceDAO;
import main.model.Utente;

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


