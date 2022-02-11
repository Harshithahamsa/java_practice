package com.te.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.hibernate.jpa.beans.Employee;

public class Read {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("EmpUnit01");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Employee employee = entityManager.find(Employee.class, 2);
		System.out.println(employee);
		
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
	}
}
