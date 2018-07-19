package com.virtualpairprogrammers.services;

import java.util.List;

import com.virtualpairprogrammers.dao.CanzoneDAO;

import com.virtualpairprogrammers.model.Canzone;
import com.virtualpairprogrammers.model.Utente;

public class CanzoneService {
	 private CanzoneDAO canzoneDAO;

	  public CanzoneService() {
	        this.canzoneDAO = new CanzoneDAO();
	    }
	
	public List<Canzone> getCanzoni(Utente u) {
		return canzoneDAO.getCanzoni(u);
	}
	public Canzone getCanzone(int id) {
		return canzoneDAO.getCanzone(id);
	}
}
