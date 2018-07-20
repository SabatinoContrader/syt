package com.virtualpairprogrammers.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.virtualpairprogrammers.model.VotazioneCantante;
import com.virtualpairprogrammers.model.Voto;
import com.virtualpairprogrammers.utils.ConnectionSingleton;
import com.virtualpairprogrammers.utils.GestoreEccezioni;

public class VotaCantanteDAO {
	private final String QUERY_INSERTVOTO = "INSERT INTO `sytdb`.`votazione_cantante"
			+ "` (`id_registrazione`, `id_cantante`, `orecchiabilita`, `lo_scaricheresti`) VALUES (?,?,?,?)";

	public VotaCantanteDAO() {

	}

	public boolean insertVoto(VotazioneCantante votazioneCantante) {
		Connection connection = ConnectionSingleton.getInstance();
        boolean b=false;
        try {
        	PreparedStatement statement = connection.prepareStatement(QUERY_INSERTVOTO);
           
        	statement.setInt(1, votazioneCantante.getIdRegistrazione());
        	statement.setInt(2, votazioneCantante.getIdCantante());
        	statement.setDouble(3, votazioneCantante.getOrecchiabilita());
            statement.setDouble(4,votazioneCantante.getDownload());

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
