package com.te.hibernate.jpa.app;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.te.hibernate.jpa.beans.Person;
import com.te.hibernate.jpa.beans.SmartPhone;

public class Join {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PersonUnit01");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		String query = "select p.personName, sm.smName from Person as p INNER JOIN p.phone as sm";
		Query query_ = entityManager.createQuery(query);
		List<Object[]> resultList = query_.getResultList();
		for (Object[] objects : resultList) {
			System.out.println(Arrays.toString(objects));
		}
	}	
}
