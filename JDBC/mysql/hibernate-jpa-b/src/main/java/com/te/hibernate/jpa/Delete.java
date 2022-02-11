package com.te.hibernate.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.sun.xml.internal.ws.api.model.MEP;
import com.te.hibernate.jpa.beans.Employee;

public class Delete {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("EmpUnit01");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Employee employee = entityManager.find(Employee.class, 2);
		System.out.println(employee);
		
		entityTransaction.begin();
		entityManager.remove(employee);
		entityTransaction.commit();
	}
}
