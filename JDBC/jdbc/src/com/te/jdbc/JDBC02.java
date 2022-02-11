package com.te.jdbc;

// import JDBC API
import java.sql.*;
import javax.sql.*;


public class JDBC02 {
	public static void main(String[] args) {
		Connection connection = null;
		try {
			// 2. Load and Register JDBC Driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//3. Establish connection with database
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
//			Statement statement = connection.createStatement();
			
			//5. Write a query 
//			String query = "insert into student(s_id,s_name,s_age) values (1,'deepankar',22)";
			String query = "insert into student(s_id,s_name,s_age) values (?,?,?)";
			PreparedStatement prepareStatement = connection.prepareStatement(query);
			prepareStatement.setInt(1, 9);
			prepareStatement.setString(2, "Sankar");
			prepareStatement.setInt(3, 23);
			// 6.process the result
			//statement.execute();
			//statement.executeUpdate();
			//statement.executeQuery();
//			boolean execute = prepareStatement.execute();
			
			//executeUpdate giving how many row it affected in the database
			int executeUpdate = prepareStatement.executeUpdate();
			System.out.println(executeUpdate);
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
