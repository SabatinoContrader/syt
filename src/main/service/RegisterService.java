package main.service;

import main.dao.RegisterDAO;
import main.model.Utente;

public class RegisterService {
	
	private RegisterDAO registerDAO;

    public RegisterService() {
        this.registerDAO = new RegisterDAO();
    }

    public boolean register (Utente utente) {
        return this.registerDAO.register(utente);
    }
}
