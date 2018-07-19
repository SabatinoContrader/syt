package com.virtualpairprogrammers.services;

import com.virtualpairprogrammers.dao.VotaDAO;

import com.virtualpairprogrammers.model.Utente;
import com.virtualpairprogrammers.model.VotazioneGiudice;
import com.virtualpairprogrammers.model.Voto;

public class VotaService {
	//private static final String  = null;
	private VotaDAO votaDAO;

    public VotaService() {
        this.votaDAO = new VotaDAO();
    }

    public boolean insertVoto (VotazioneGiudice votazioneGiudice) {
  
       return votaDAO.insertVoto(votazioneGiudice);
    
    }
}



