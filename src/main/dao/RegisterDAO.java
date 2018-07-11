package main.dao;

import main.ConnectionSingleton;
import main.controller.GestoreEccezioni;
import main.model.Utente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDAO {

    private final String QUERY_REGISTER = "INSERT INTO `sytdb`.`utente` (`nome`, `cognome`, `email`, `data_nascita`, `luogo_nascita`, `sesso`, `genere`, `livello`, `telefono`, `ruolo`, `cantante_to_giudice`, `tentativi`, `username`, `password`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    public boolean register (Utente utente) {
        Connection connection = ConnectionSingleton.getInstance();
        try {
            PreparedStatement statement = connection.prepareStatement(QUERY_REGISTER);
            statement.setString(1, utente.getNome());
            statement.setString(2, utente.getCognome());
            statement.setString(3, utente.getEmail());
            statement.setString(4, utente.getdataNascita());
            statement.setString(5, utente.getluogoNascita());
            statement.setString(6, utente.getSesso());
            statement.setString(7, utente.getGenere());
            statement.setInt(8, utente.getLivello());
            statement.setString(9, utente.getTelefono());
            statement.setString(10, utente.getRuolo());
            statement.setBoolean(11, utente.iscantanteToGiudice());
            statement.setInt(12, utente.getTentativi());
            statement.setString(13, utente.getUsername());
            statement.setString(14, utente.getPassword());
            return statement.execute();
        }
        catch (SQLException e) {
            GestoreEccezioni.getInstance().gestisciEccezione(e);
            return false;
        }
    }
}


