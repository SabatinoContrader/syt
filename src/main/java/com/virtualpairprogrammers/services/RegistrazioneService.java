package com.virtualpairprogrammers.services;


import java.util.List;

import com.virtualpairprogrammers.dao.RegistrazioneDAO;
import com.virtualpairprogrammers.model.Registrazione;

public class RegistrazioneService {

    private RegistrazioneDAO registrazioneDAO;

    public RegistrazioneService() {
        this.registrazioneDAO = new RegistrazioneDAO();
    }

    public List<Registrazione> getAllRegistrazioni (String user) {
        return this.registrazioneDAO.getAllRegistrazioni (user);
    }
}