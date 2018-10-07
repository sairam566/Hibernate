package com.tsr.test;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test_Orcl_JDBC_Connection {

	public static void main(String[] args) {
		
		String URL = "jdbc:oracle:thin:@localhost:1521:orcl";
		String Usr = "thaXX";
		String Pass = "tXX";
		Connection connection = null;
		
		try {
			
			connection = DriverManager.getConnection(URL, Usr, Pass);
			
			if(null!= connection)
			{
				System.out.println("Connection Established Successfully");
			}
			else
			{
				System.out.println("Failed To Established Connection");
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
