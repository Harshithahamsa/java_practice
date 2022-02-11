package com.te.hibernate.jpa.beans;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Insert {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PersonUnit01");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		SmartPhone phone = new SmartPhone();
		phone.setSmName("Nokia");
		
		Person person = new Person();
		person.setPersonName("Person01");
		person.setPhone(phone);
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
	}	
}
