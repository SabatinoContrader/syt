package main.service;

import main.dao.RegisterDAO;

public class RegisterService {
	
	private RegisterDAO registerDAO;

    public RegisterService() {
        this.registerDAO = new RegisterDAO();
    }

    public boolean register (String nome, String cognome, String email, String data_nascita, String luogo_nascita, String sesso, String genere,  String telefono, String ruolo, String username, String password) {
        return this.registerDAO.register(nome, cognome, email, data_nascita, luogo_nascita, sesso, genere, telefono, ruolo, username, password);
    }
}
