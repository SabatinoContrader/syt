package main.dao;

import main.ConnectionSingleton;
import main.model.Registrazione;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class RegistrazioneDAO {

    private final String QUERY_ALL = "select * from registrazione";

    public RegistrazioneDAO() {

    }

    public List<Registrazione> getAllRegistrazioni () {
        List<Registrazione> registrazioni = new ArrayList<>();
        Connection connection = ConnectionSingleton.getInstance();
        try {
           Statement statement = connection.createStatement();
           ResultSet resultSet = statement.executeQuery(QUERY_ALL);
           while (resultSet.next()) {
               int idRegistrazione = resultSet.getInt("id_registrazione");
               String registrazione = resultSet.getString("registrazione");
               int idUtente = resultSet.getInt("id_utente");
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
