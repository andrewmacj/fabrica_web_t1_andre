package br.com.fabricadeprogramador.persistencia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public static Connection getConnection() {
		
		try {
			return DriverManager.getConnection("jdbc:postgresql://localhost:5432/Fabricaweb","postgres", "123");
		} catch (SQLException e) {
			//relancando  a exception
			throw new RuntimeException(e);
		}
	}

}
