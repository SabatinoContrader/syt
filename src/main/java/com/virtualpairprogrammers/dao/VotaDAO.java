package com.virtualpairprogrammers.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.virtualpairprogrammers.model.VotazioneGiudice;
import com.virtualpairprogrammers.model.Voto;
import com.virtualpairprogrammers.utils.ConnectionSingleton;
import com.virtualpairprogrammers.utils.GestoreEccezioni;

public class VotaDAO {
	private final String QUERY_INSERTVOTO = "INSERT INTO `sytdb`.`votazione_giudice"
			+ "` (`id_registrazione`, `id_giudice`, `intonazione`, `timbro`,`tono`, `unicita`) VALUES (?,?,?, ?, ?,?)";

	public VotaDAO() {

	}

	public boolean insertVoto(VotazioneGiudice votazionegiudice) {
		Connection connection = ConnectionSingleton.getInstance();
        boolean b=false;
        try {
        	PreparedStatement statement = connection.prepareStatement(QUERY_INSERTVOTO);
           
        	statement.setInt(1, votazionegiudice.getIdRegistrazione());
        	statement.setInt(2, votazionegiudice.getIdGiudice());
        	statement.setDouble(3, votazionegiudice.getIntonazione());
            statement.setDouble(4,votazionegiudice.getTimbro());
        	statement.setDouble(5,votazionegiudice.getTono());
        	statement.setDouble(6,votazionegiudice.getUnicita());
        	if(statement.executeUpdate()>0) {
            	b=true;
            }
            return b;
        }
        catch (SQLException e) {
            GestoreEccezioni.getInstance().gestisciEccezione(e);
            return b;
        }
		
    
	}
}
