package com.te.jdbc.test;

// import JDBC API
import java.sql.*;
import java.util.Scanner;

import javax.sql.*;


public class InsertData {
	public void insertData() {
		Connection connection = null;
		String studentName = null;
		int studentAge = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name");
		studentName = scanner.next();
		System.out.println("Enter Age");
		studentAge = scanner.nextInt();
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
			//5. Write a query 

			String query = "insert into student_data(s_name,s_age) values (?,?)";
			PreparedStatement prepareStatement = connection.prepareStatement(query);

			prepareStatement.setString(1, studentName);
			prepareStatement.setInt(2, studentAge);
			// 6.process the result
			
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
