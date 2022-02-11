package com.te.assignment.dao;

import java.sql.*;
import java.util.Scanner;

public class JDBCImplementation {
	Scanner scn = new Scanner(System.in);
	String url = "jdbc:mysql://localhost:3306/assignment";
	String user = "root";
	String password = "root";
	public void getById() {
		Connection connection=null;
		System.out.println("enter the id to fetch");
		int id=scn.nextInt();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				connection = DriverManager.getConnection(url, user, password);
				String query = "select * from student where stu_id=?";
				PreparedStatement preparedStatement=connection.prepareStatement(query);
				preparedStatement.setInt(1, id);
				ResultSet res=preparedStatement.executeQuery();
				while(res.next()) {
					System.out.print(res.getInt(1)+ " ");
					System.out.print(res.getString(2)+ " ");
					System.out.println(res.getLong(3));
				}
				
			
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return;

	}

	public void findAll() {
		Connection connection=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			try {
				connection = DriverManager.getConnection(url, user, password);
				String query = "select * from student";
				PreparedStatement preparedStatement=connection.prepareStatement(query);
				ResultSet res=preparedStatement.executeQuery(query);
				while(res.next()) {
					System.out.print(res.getInt(1)+ " ");
					System.out.print(res.getString(2)+ " ");
					System.out.println(res.getLong(3));
				}
				
			
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return;

	}

	public void delete() {
		Connection connection = null;
		System.out.println("enter the id to delete");
		int id = scn.nextInt();
		try {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			}
			try {
				connection = DriverManager.getConnection(url, user, password);
				String query = "delete from student where stu_id=?";
				PreparedStatement preparedStatement = connection.prepareStatement(query);
				preparedStatement.setInt(1, id);
				int execute = preparedStatement.executeUpdate();

				System.out.println(execute+" rows deleted");
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		finally {
			try {
				connection.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return;

	}

	public void update() {
		Connection connection = null;
		System.out.println("enter the name to be changed in the id");
		String name = scn.next();
		int id=scn.nextInt();
		System.out.println(id);
		try {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			}
			try {
				connection = DriverManager.getConnection(url, user, password);
				String query = "update student set stu_name=? where stu_id=?";
				PreparedStatement preparedStatement = connection.prepareStatement(query);
				preparedStatement.setString(1, name);
				preparedStatement.setDouble(2, id);
				int execute = preparedStatement.executeUpdate();

				System.out.println(execute+" rows updated");
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		finally {
			try {
				connection.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return;

	}


	public void insert() {
		Connection connection = null;
		System.out.println("enter the name and phone number");
		String name = scn.next();
		long phone = scn.nextLong();
		try {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			}
			try {
				connection = DriverManager.getConnection(url, user, password);
				String query = "insert into student(stu_name,stu_phone) values(?,?)";
				PreparedStatement preparedStatement = connection.prepareStatement(query);
				preparedStatement.setString(1, name);
				preparedStatement.setLong(2, phone);
				int execute = preparedStatement.executeUpdate();

				System.out.println(execute+" rows inserted");
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		finally {
			try {
				connection.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return;

	}

}


