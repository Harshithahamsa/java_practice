package com.te.hibernate.jpa.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JPQL05 {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PersonUnit01");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		String query = "update SmartPhone set smName=:name where smId=:id";
		Query query_ = entityManager.createQuery(query);
		query_.setParameter("id", 2);
		query_.setParameter("name", "Motorola");
		entityTransaction.begin();
		int executeUpdate = query_.executeUpdate();
		entityTransaction.commit();
		System.out.println(executeUpdate);
	}
}
