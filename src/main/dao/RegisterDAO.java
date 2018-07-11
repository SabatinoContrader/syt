package main.dao;

import main.ConnectionSingleton;
import main.controller.GestoreEccezioni;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDAO {

    private final String QUERY_REGISTER = "INSERT INTO `sytdb`.`utente` (`nome`, `cognome`, `email`, `data_nascita`, `luogo_nascita`, `sesso`, `genere`, `livello`, `telefono`, `ruolo`, `username`, `password`) VALUES ('?', '?', '?', '?', '?', '?', '?', '?', '?', '?', '?');";

    public boolean register (String nome, String cognome, String email, String data_nascita, String luogo_nascita, String sesso, String genere, String telefono, String ruolo, String username, String password) {

        Connection connection = ConnectionSingleton.getInstance();
        try {
            PreparedStatement statement = connection.prepareStatement(QUERY_REGISTER);
            statement.setString(1, nome);
            statement.setString(2, cognome);
            statement.setString(3, email);
            statement.setString(4, data_nascita);
            statement.setString(5, luogo_nascita);
            statement.setString(6, sesso);
            statement.setString(7, genere);
            statement.setString(8, telefono);
            statement.setString(9, ruolo);
            statement.setString(10, username);
            statement.setString(11, password);
            return statement.executeQuery().next();
        }
        catch (SQLException e) {
            GestoreEccezioni.getInstance().gestisciEccezione(e);
            return false;
        }
    }
}

