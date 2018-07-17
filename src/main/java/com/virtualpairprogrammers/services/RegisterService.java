package com.virtualpairprogrammers.services;

import com.virtualpairprogrammers.dao.RegisterDAO;
import com.virtualpairprogrammers.model.Utente;

public class RegisterService {
	
	private RegisterDAO registerDAO;

    public RegisterService() {
        this.registerDAO = new RegisterDAO();
    }

    public boolean register (Utente utente) {
        return this.registerDAO.register(utente);
    }
}
