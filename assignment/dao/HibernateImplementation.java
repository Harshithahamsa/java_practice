package com.te.assignment.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Scanner;

import javax.persistence.*;

import com.te.assignment.dto.Student;

public class HibernateImplementation implements Serializable {
	Scanner scn = new Scanner(System.in);

	public void getById() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("StudentUnit01");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		System.out.println("Enter the id");
		int id = scn.nextInt();

		String query = "from Student where stuId=:IDENT ";
		Query query1 = entityManager.createQuery(query);
		query1.setParameter("IDENT", id);
		List resultList = query1.getResultList();
		for (Object object : resultList) {
			System.out.println(object);
		}
		return;

	}

	public void findAll() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("StudentUnit01");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String query = "from Student";
		Query query_ = entityManager.createQuery(query);
		List resultList = query_.getResultList();
		for (Object object : resultList) {
			System.out.println(object);
		}
		return;

	}

	public void delete() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("StudentUnit01");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		System.out.println("enter the id to delete");
		int id = scn.nextInt();

		String query = "delete from Student where stuId=:IDENT";
		Query query1 = entityManager.createQuery(query);
		query1.setParameter("IDENT", id);

		entityTransaction.begin();
		int executeUpdate = query1.executeUpdate();
		System.out.println(executeUpdate+" row deleted");
		entityTransaction.commit();
		return;

	}

	public void insert() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("StudentUnit01");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		System.out.println("enter the name and phone number");
		String name = scn.next();
		long phone = scn.nextLong();

		Student student = new Student();
		student.setStuName(name);
		student.setStuPhone(phone);

		entityTransaction.begin();
		entityManager.persist(student);
		System.out.println("1 record inserted");
		entityTransaction.commit();
		return;

	}

	public void update() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("StudentUnit01");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		System.out.println("enter the name to be changed in the id");
		String name = scn.next();
		int id = scn.nextInt();

		String query = "update Student set stuName=:IDEN where stuId=:IDEN1";
		Query query1 = entityManager.createQuery(query);
		query1.setParameter("IDEN", name);
		query1.setParameter("IDEN1", id);

		entityTransaction.begin();
		int executeUpdate = query1.executeUpdate();
		System.out.println(executeUpdate+" row updated");
		entityTransaction.commit();
		return;
	}

}
