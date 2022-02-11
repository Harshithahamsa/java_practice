package com.te.hibernate.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.sun.xml.internal.ws.api.model.MEP;
import com.te.hibernate.jpa.beans.Employee;

public class Insert {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("EmpUnit01");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Employee employee = new Employee();
		employee.setEmpName("Name03");
		employee.setEmpPhonenumber(12375678L);
		
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
	}
}
