package com.virtualpairprogrammers.services;

import com.virtualpairprogrammers.dao.VotaCantanteDAO;

import com.virtualpairprogrammers.model.Utente;
import com.virtualpairprogrammers.model.VotazioneCantante;

public class VotaCantanteService {
	//private static final String  = null;
	private VotaCantanteDAO votaCantanteDAO;

    public VotaCantanteService() {
        this.votaCantanteDAO = new VotaCantanteDAO();
    }

    public boolean insertVoto (VotazioneCantante votazioneCantante) {
  
       return votaCantanteDAO.insertVoto(votazioneCantante);
    
    }
}



