package com.virtualpairprogrammers.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.virtualpairprogrammers.model.Canzone;
import com.virtualpairprogrammers.model.Utente;
import com.virtualpairprogrammers.utils.ConnectionSingleton;
import com.virtualpairprogrammers.utils.GestoreEccezioni;

public class CanzoneDAO {

	private final String QUERY_GET_CANZONI = "select * from canzone where livello = ? and genere = ?";
	private final String QUERY_GET_CANZONE="select * from canzone where id_canzone=?";
	
	public List<Canzone> getCanzoni(Utente u) {
		 Connection connection = ConnectionSingleton.getInstance();
	        ResultSet resultSet=null;
	        try {
	        	
	            PreparedStatement statement = connection.prepareStatement(QUERY_GET_CANZONI);
	            statement.setInt(1, u.getLivello());
	            statement.setString(2, u.getGenere());
	            resultSet= statement.executeQuery();
	            
	            List<Canzone> canzoni = new ArrayList<Canzone>();
	            
	            while (resultSet.next()) {
	            	Canzone c = new Canzone (resultSet.getInt("id_canzone"), resultSet.getInt("livello"), resultSet.getString("genere"), resultSet.getString("url_canzone"), resultSet.getString("titolo"));            	
	            	canzoni.add(c);
	            }
	            
	            return canzoni;
	        }
	        catch (SQLException e) {
	            GestoreEccezioni.getInstance().gestisciEccezione(e);
	            return null;
	        }
	}


	public Canzone getCanzone(int id) {
		Connection connection = ConnectionSingleton.getInstance();
        ResultSet resultSet=null;
        try {
        	
            PreparedStatement statement = connection.prepareStatement(QUERY_GET_CANZONE);
            statement.setInt(1, id);
            resultSet= statement.executeQuery();
            
            Canzone canzone = null;
            
           if (resultSet.next()) {
        	   canzone = new Canzone (resultSet.getInt("id_canzone"), resultSet.getInt("livello"), resultSet.getString("genere"), resultSet.getString("url_canzone"), resultSet.getString("titolo"));            	
            }
            
            return canzone;
        }
        catch (SQLException e) {
            GestoreEccezioni.getInstance().gestisciEccezione(e);
            return null;
        }
	}

}
