package com.te.jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
// import JDBC API
import java.sql.*;
import java.util.Properties;

import javax.sql.*;


public class JDBC05 {
	public static void main(String[] args) {
		Connection connection = null;
		try {
			// 2. Load and Register JDBC Driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//3. Establish connectiion with database
			Properties properties = new Properties();
			
			try {
				FileInputStream fileInputStream = new FileInputStream("db.properties");
				try {
					properties.load(fileInputStream);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			connection = DriverManager.getConnection(properties.getProperty("url"),properties.getProperty("username"),properties.getProperty("password"));
		
			//4. Create StateMent
			//5. Write a query 
			String query = "call select_all";
			CallableStatement prepareCall = connection.prepareCall(query);
			
			
			
			// 6.process the result
			ResultSet executeQuery = prepareCall.executeQuery();
			while (executeQuery.next()) {
				System.out.print(executeQuery.getInt(1)+" ");
				System.out.print(executeQuery.getString(2)+ " ");
				System.out.println(executeQuery.getInt(3));
			}
			
			System.out.println(executeQuery);
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			//7. Close the connection
//			connection = null;
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
