package com.virtualpairprogrammers.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.virtualpairprogrammers.model.Registrazione;
import com.virtualpairprogrammers.utils.ConnectionSingleton;

public class RegistrazioneDAO {

    private final String QUERY_ALL = "SELECT registrazione.* FROM registrazione, utente WHERE registrazione.id_utente=utente.id_utente AND utente.username=?";

    public RegistrazioneDAO() {

    }

    public List<Registrazione> getAllRegistrazioni (String user) {
        List<Registrazione> registrazioni = new ArrayList<>();
        Connection connection = ConnectionSingleton.getInstance();
        ResultSet resultSet=null;
        try {
        	 PreparedStatement statement = connection.prepareStatement(QUERY_ALL);
        	 
             statement.setString(1, user);
             
             resultSet= statement.executeQuery();
           
           while (resultSet.next()) {
        	   int idRegistrazione = resultSet.getInt("id_registrazione");
               int idUtente = resultSet.getInt("id_utente");
               String registrazione = resultSet.getString("registrazione");
               String dataCreazione = resultSet.getString("data_creazione");
               int idCanzone = resultSet.getInt("id_canzone");
               registrazioni.add(new Registrazione(idRegistrazione, registrazione, idUtente, idCanzone, dataCreazione));
           }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return registrazioni;
    }
}
