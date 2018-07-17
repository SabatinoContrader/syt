package com.virtualpairprogrammers.dao;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.virtualpairprogrammers.model.Utente;
import com.virtualpairprogrammers.utils.ConnectionSingleton;
import com.virtualpairprogrammers.utils.GestoreEccezioni;

public class LoginDAO {

    private final String QUERY_LOGIN = "select * from utente where username = ? and password = ?";
    
    
    
    public Utente login (String username, String password) {

        Connection connection = ConnectionSingleton.getInstance();
        ResultSet resultSet=null;
        try {
        	
            PreparedStatement statement = connection.prepareStatement(QUERY_LOGIN);
            statement.setString(1, username);
            statement.setString(2, password);
            resultSet= statement.executeQuery();
            
            Utente utente = null;
            
            if (resultSet.next()) {
            	utente = new Utente (resultSet.getInt("id_utente"), resultSet.getString("nome"), resultSet.getString("cognome"), resultSet.getString("email"), resultSet.getString("luogo_nascita"), resultSet.getString("data_nascita"), resultSet.getString("sesso"), resultSet.getString("genere"), resultSet.getInt("tentativi"), resultSet.getInt("livello"), resultSet.getString("telefono"), resultSet.getString("password"), resultSet.getString("username"), resultSet.getString("ruolo"), resultSet.getBoolean("cantante_to_giudice"), resultSet.getString("avatar"));            	
            	
            }
            
            return utente;
        }
        catch (SQLException e) {
            GestoreEccezioni.getInstance().gestisciEccezione(e);
            return null;
        }
    }
}
