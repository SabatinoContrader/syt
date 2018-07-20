package com.virtualpairprogrammers.services;

import com.virtualpairprogrammers.dao.VotaDAO;
import com.virtualpairprogrammers.dao.VotazioneSistemaDAO;
import com.virtualpairprogrammers.model.VotazioneSistema;

public class VotazioneSistemaService {
	private VotazioneSistemaDAO votazioneSistemaDAO;

    public VotazioneSistemaService() {
        this.votazioneSistemaDAO = new VotazioneSistemaDAO();
    }

    public boolean insertVoto (VotazioneSistema votazioneSistema) {
  
       return votazioneSistemaDAO.insertVoto(votazioneSistema);
    
    }
}

