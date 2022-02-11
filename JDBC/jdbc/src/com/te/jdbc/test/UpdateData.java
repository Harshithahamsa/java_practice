package com.te.jdbc.test;

import java.sql.*;
import java.util.Scanner;

import javax.sql.*;

public class UpdateData {
	public void updateData() {
		Connection connection = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("If you want change name of student press '1' and you want to change age press '2'");
		int input = scanner.nextInt();
		try {
			Class.forName("com.mysql.jdbc.Driver");

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");

			if (input == 1) {
				System.out.println("Enter the name of the student you want to change : ");
				String previousName = scanner.next();
				System.out.println("Enter the new Name :");
				String updateName = scanner.next();
				String query = "call name_update(?,?)";
				CallableStatement prepareCall = connection.prepareCall(query);
				prepareCall.setString(1, updateName);
				prepareCall.setString(2, previousName);

				System.out.println(updateName);
				System.out.println(previousName);
				prepareCall.executeQuery();

			} else if (input == 2) {

				System.out.println("Enter the name of the student you want to change the age: ");
				String name = scanner.next();
				System.out.println("Enter the new Age :");
				int newAge = scanner.nextInt();
				String query = "call age_update(?,?)";
				CallableStatement prepareCall = connection.prepareCall(query);
				prepareCall.setString(1, name);
				prepareCall.setInt(2, newAge);

				System.out.println(name);
				System.out.println(newAge);
				prepareCall.executeQuery();
				
			} else {
				System.out.println("Wrong Input");
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
