package com.tsr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class App 
{
    public static void main( String[] args )
    {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        boolean flag = false;
        final String INSERT = "insert into product values(?,?,?,?)";
        try {
        	connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hibernate", "sairam", "sairam");
        	connection.setAutoCommit(false);
        	
        	preparedStatement = connection.prepareStatement(INSERT);
        	preparedStatement.setInt(1, 2);
        	preparedStatement.setString(2, "Apple");
        	preparedStatement.setString(3, "Ipad Pro 12.5 inch");
        	preparedStatement.setInt(4, 100000);
        	
        	preparedStatement.executeUpdate();
        	
        	flag = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(preparedStatement !=null) {
					preparedStatement.close();
				}
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
			try {
				if(connection !=null) {
					if (flag) {
						connection.commit();
						System.out.println("Successfully Inserted");
					} else {
						connection.rollback();
						System.out.println("Not inserted");
					}
					connection.close();
				}
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
    }
}
