package com.tsr.utils;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionManager {
	
	private static Properties ps = null;
	
	static {
		try {
			ps = new Properties();
			ps.load(ConnectionManager.class.getClassLoader().getResourceAsStream("db.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(ps.getProperty("db.url"), ps.getProperty("db.usr"),ps.getProperty("db.pwd"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

}
