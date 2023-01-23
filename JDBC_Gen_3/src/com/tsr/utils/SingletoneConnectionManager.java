package com.tsr.utils;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class SingletoneConnectionManager {

	private static SingletoneConnectionManager singletonCM = null;
	private static Properties ps = null;
	
	private SingletoneConnectionManager() {
		ps = new Properties();
		try {
			ps.load(this.getClass().getClassLoader().getResourceAsStream("db.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static synchronized SingletoneConnectionManager getInstance() {
		if(singletonCM == null) {
			singletonCM = new SingletoneConnectionManager();
		}
		return singletonCM;
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
