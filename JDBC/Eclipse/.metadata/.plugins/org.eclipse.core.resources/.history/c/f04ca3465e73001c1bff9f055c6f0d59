package com.te.jdbc.test;

import java.sql.*;

import java.util.Scanner;


public class DeleteData {
	public void deleteData() {
		Connection connection = null;
		String nameFromDatabase = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of the student you want to delete");
		String inputName = scanner.next();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
			String query = "call is_name_present(?)";
			CallableStatement prepareCall = connection.prepareCall(query);
			prepareCall.setString(1, inputName);
			ResultSet executeQuery = prepareCall.executeQuery();
			while (executeQuery.next()) {
				nameFromDatabase = executeQuery.getString(1);
				
			}
			
			if (inputName.equals(nameFromDatabase)) {
				String deleteQuery = "call delete_student_data(?)";
				CallableStatement deleteCallableStatement = connection.prepareCall(deleteQuery);
				deleteCallableStatement.setString(1, nameFromDatabase);
				deleteCallableStatement.executeQuery();
				System.out.println("Student " + nameFromDatabase + " data is deleted");
			} else {
				System.out.println("Name is not present in the database");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
