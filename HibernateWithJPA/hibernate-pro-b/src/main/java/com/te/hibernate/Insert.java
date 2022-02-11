package com.te.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import com.te.hibernate.jpa.beans.Employee;

/**
 * Hello world!
 *
 */
public class Insert 
{
    public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("EmpUnit01");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Employee employee = new Employee();
//		employee.getEmpId();
		employee.setEmployee("hello");
		employee.setEmpPhoneNumber(6666464);
		
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
	}
}