package com.te.hibernate.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.hibernate.jpa.beans.User;

public class Insert {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("unit01");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		User user = new User();
		user.setUserName("Name01");
		user.setUserPhoneNumber(9876540987L);
		
		entityTransaction.begin();
		entityManager.merge(user);
		entityTransaction.commit();
	}						
}
