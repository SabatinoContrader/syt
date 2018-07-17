package com.virtualpairprogrammers.services;

import com.virtualpairprogrammers.dao.LoginDAO;
import com.virtualpairprogrammers.model.Utente;

public class LoginService {

    private LoginDAO loginDAO;

    public LoginService() {
        this.loginDAO = new LoginDAO();
    }

    public Utente login (String username, String password) {
        return loginDAO.login(username, password);
    }
}
