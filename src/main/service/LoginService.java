package main.service;

import main.dao.LoginDAO;
import main.model.Utente;

public class LoginService {

    private LoginDAO loginDAO;

    public LoginService() {
        this.loginDAO = new LoginDAO();
    }

    public Utente login (String username, String password) {
        return loginDAO.login(username, password);
    }
}
