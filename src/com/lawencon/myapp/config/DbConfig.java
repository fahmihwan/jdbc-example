package com.lawencon.myapp.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConfig {
	
	private static Connection conn;
	
	private DbConfig() {}
	
	public synchronized static Connection conn() throws SQLException {
		final String url = "jdbc:postgresql://localhost:5432/test";
		final String username = "postgres";
		final String pass = "postgres";
		
		if(conn != null) {
			return conn;
		}
		
		conn = DriverManager.getConnection(url, username, pass);
		return conn;
	}
	
}
