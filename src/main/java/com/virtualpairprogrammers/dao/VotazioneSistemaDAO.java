package com.virtualpairprogrammers.dao;

import com.virtualpairprogrammers.model.VotazioneGiudice;
import com.virtualpairprogrammers.model.VotazioneSistema;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.virtualpairprogrammers.utils.ConnectionSingleton;
import com.virtualpairprogrammers.utils.GestoreEccezioni;

public class VotazioneSistemaDAO {
	private final String QUERY_INSERTVOTAZIONESISTEMA = "INSERT INTO `sytdb`.`votazione_sistema"
			+ "` (`id_registrazione`, `fedelta`, `intonazione`,`potenza`, `estensione`,`data`) VALUES (?,?,?, ?,?,?)";
	
	public boolean insertVoto(VotazioneSistema votazioneSistema) {
		Connection connection = ConnectionSingleton.getInstance();
        boolean b=false;
        try {
        	PreparedStatement statement = connection.prepareStatement(QUERY_INSERTVOTAZIONESISTEMA);
           
        	statement.setInt(1, votazioneSistema.getIdRegistrazione());
        	statement.setDouble(2, votazioneSistema.getFedelta());
        	statement.setDouble(3, votazioneSistema.getIntonazione());
            statement.setDouble(4,votazioneSistema.getPotenza());
            statement.setDouble(5,votazioneSistema.getEstensione());
            statement.setString(6,votazioneSistema.getData());
        	
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
