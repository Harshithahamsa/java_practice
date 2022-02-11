package com.te.hibernate.jpa.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.te.hibernate.jpa.beans.Call;

public class JPQL03 {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PersonUnit01");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		String query = "from Call where callUserName=:name";
		Query query_ = entityManager.createQuery(query);
		query_.setParameter("name", "UN02");
		Call singleResult = (Call) query_.getSingleResult();
		System.out.println(singleResult);
	}
}
