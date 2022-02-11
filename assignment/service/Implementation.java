package com.te.assignment.service;

import java.util.Scanner;

import com.te.assignment.dao.HibernateImplementation;
import com.te.assignment.dao.JDBCImplementation;

public class Implementation {
	static Scanner scn = new Scanner(System.in);

	public static void implement() {
		System.out.println("choose implementation method hibernate/jdbc");
		String implementation = scn.next();
		if (implementation.equalsIgnoreCase("hibernate")) {
			System.out.println("select the following to perform on database");
			System.out.println("1-for fetching all records");
			System.out.println("2-for finding a record using id");
			System.out.println("3-for deleting records");
			System.out.println("4-for updating records");
			System.out.println("5-for inserting records");
			int inputFromUser = scn.nextInt();
			switch (inputFromUser) {
			case 1:
				HibernateImplementation hibernateImplementation1 = new HibernateImplementation();
				hibernateImplementation1.findAll();
				break;
			case 2:
				HibernateImplementation hibernateImplementation2 = new HibernateImplementation();
				hibernateImplementation2.getById();
				break;
			case 3:
				HibernateImplementation hibernateImplementation3 = new HibernateImplementation();
				hibernateImplementation3.delete();
				break;
			case 4:
				HibernateImplementation hibernateImplementation4 = new HibernateImplementation();
				hibernateImplementation4.update();
				break;
			case 5:
				HibernateImplementation hibernateImplementation5 = new HibernateImplementation();
				hibernateImplementation5.insert();
				break;

			default:
				System.out.println("Invalid Response");
				break;
			}
		}
		if (implementation.equalsIgnoreCase("jdbc")) {
			System.out.println("select the following to perform on database");
			System.out.println("1-for fetching all records");
			System.out.println("2-for finding a record using id");
			System.out.println("3-for deleting records");
			System.out.println("4-for updating records");
			System.out.println("5-for inserting records");
			int inputFromUser = scn.nextInt();
			switch (inputFromUser) {
			case 1:
				JDBCImplementation jdbcImplementation1 = new JDBCImplementation();
				jdbcImplementation1.findAll();
				break;
			case 2:
				JDBCImplementation jdbcImplementation2 = new JDBCImplementation();
				jdbcImplementation2.getById();
				break;
			case 3:
				JDBCImplementation jdbcImplementation3 = new JDBCImplementation();
				jdbcImplementation3.delete();
				break;
			case 4:
				JDBCImplementation jdbcImplementation4 = new JDBCImplementation();
				jdbcImplementation4.update();
				break;
			case 5:
				JDBCImplementation jdbcImplementation5 = new JDBCImplementation();
				jdbcImplementation5.insert();
				break;

			default:
				System.out.println("Invalid Response");
				break;
			}
		}

	}

}
