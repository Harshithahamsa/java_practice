package com.te.hibernate.jpa.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JPQL02 {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PersonUnit01");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		String query = "update Call set callUserName='tiger' where callId=1";
		Query query_ = entityManager.createQuery(query);

		entityTransaction.begin();
		int executeUpdate = query_.executeUpdate();
		System.out.println(executeUpdate);
		entityTransaction.commit();
	}
}
