package com.te.hibernate.jpa.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.hibernate.jpa.beans.Person;
import com.te.hibernate.jpa.beans.SmartPhone;

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
		
		phone.setPerson(person);
		
		entityTransaction.begin();
		entityManager.persist(phone);
		entityTransaction.commit();
	}	
}
