package main.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import main.ConnectionSingleton;
import main.model.Utente;

public class GiudiceDAO {
	
    private final String QUERY_SEARCH = "SELECT * FROM utente WHERE username LIKE ? AND ruolo='C'";


    public List<Utente> getAllCantanti (String substr) {
        List<Utente> utenti = new ArrayList<>();
        Connection connection = ConnectionSingleton.getInstance();
        ResultSet resultSet=null;
        try {     
            PreparedStatement statement = connection.prepareStatement(QUERY_SEARCH);
            statement.setString(1, "%" + substr + "%");
            
            resultSet= statement.executeQuery();
            
           while (resultSet.next()) {
               int idUtente = resultSet.getInt("id_utente");
               String nome = resultSet.getString("nome");
               String cognome = resultSet.getString("cognome");
               String email = resultSet.getString("email");
               String luogoNascita = resultSet.getString("luogo_nascita");
               String dataNascita = resultSet.getString("data_nascita");
               String sesso = resultSet.getString("sesso");
               String genere = resultSet.getString("genere");
               int tentativi = resultSet.getInt("tentativi");
               int livello = resultSet.getInt("livello");
               String telefono = resultSet.getString("telefono");
               String password = resultSet.getString("password");
               String username = resultSet.getString("username");
               String ruolo = resultSet.getString("ruolo");
               boolean cantanteToGiudice = resultSet.getBoolean("cantante_to_giudice");
               String avatar = resultSet.getString("avatar");
               utenti.add(new Utente(idUtente, nome, cognome, email, luogoNascita, dataNascita, sesso, genere, tentativi, livello, telefono, password, username, ruolo, cantanteToGiudice, avatar));
           }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return utenti;
    }
    
    

}
