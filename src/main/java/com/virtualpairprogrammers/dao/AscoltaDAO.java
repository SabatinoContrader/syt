package com.virtualpairprogrammers.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.virtualpairprogrammers.model.Registrazione;
import com.virtualpairprogrammers.utils.ConnectionSingleton;
import com.virtualpairprogrammers.utils.GestoreEccezioni;

public class AscoltaDAO {

	private final String QUERY_REC = "SELECT * FROM utente, registrazione WHERE utente.username = ? AND utente.id_utente=registrazione.id_utente";

	public List<Registrazione> getAllRegistrazioni(String substr) {
		List<Registrazione> registrazioni = new ArrayList<>();
		Connection connection = ConnectionSingleton.getInstance();
		ResultSet resultSet = null;
		try {
			PreparedStatement statement = connection.prepareStatement(QUERY_REC);
			statement.setString(1, substr);

			resultSet = statement.executeQuery();

			while (resultSet.next()) {

				int idRegistrazione = resultSet.getInt("id_registrazione");
				int idUtente = resultSet.getInt("id_utente");
				String dataCreazione = resultSet.getString("data_creazione");
				int idCanzone = resultSet.getInt("id_canzone");
				

				registrazioni
						.add(new Registrazione(idRegistrazione, idUtente, idCanzone, dataCreazione));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return registrazioni;
	}
}
