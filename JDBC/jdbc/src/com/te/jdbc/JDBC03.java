package com.te.jdbc;

// import JDBC API
import java.sql.*;
import javax.sql.*;


public class JDBC03 {
	public static void main(String[] args) {
		Connection connection = null;
		try {
			// 2. Load and Register JDBC Driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//3. Establish connectiion with database
			String dbName = "student";
			String url = "jdbc:mysql://localhost:3306/" + dbName;
			String username = "root";
			String password = "root";
			
			connection = DriverManager.getConnection(url, username, password);
			if (!connection.isClosed()) {
				System.out.println("Connection Established");
			} else {
				System.out.println("Connectio was not established");
			}
		
			//4. Create StateMent
			Statement statement = connection.createStatement();
			
			//5. Write a query 
			String query = "select * from student";
			PreparedStatement prepareStatement = connection.prepareStatement(query);
			
			
			// 6.process the result
			ResultSet executeQuery = prepareStatement.executeQuery();
			while (executeQuery.next()) {
				System.out.print(executeQuery.getInt(1) + " ");
				System.out.print(executeQuery.getString(2) + " ");
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
