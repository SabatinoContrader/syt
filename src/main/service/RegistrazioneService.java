package main.service;

import main.dao.RegistrazioneDAO;
import main.model.Registrazione;

import java.util.List;

public class RegistrazioneService {

    private RegistrazioneDAO registrazioneDAO;

    public RegistrazioneService() {
        this.registrazioneDAO = new RegistrazioneDAO();
    }

    public List<Registrazione> getAllRegistrazioni (String user) {
        return this.registrazioneDAO.getAllRegistrazioni (user);
    }
}