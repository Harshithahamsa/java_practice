package com.te.jdbc.test;

// import JDBC API
import java.sql.*;
import java.util.Scanner;

import javax.sql.*;


public class ReadData {
	public void readData() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
			
			String query = "call select_all_student_data";
			CallableStatement prepareCall = connection.prepareCall(query);
			
			
			
			// 6.process the result
			ResultSet executeQuery = prepareCall.executeQuery();
			while (executeQuery.next()) {
				System.out.print(executeQuery.getInt(1)+" \t");
				System.out.print(executeQuery.getString(2)+ "\t ");
				System.out.println(executeQuery.getInt(3));
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