package com.te.hibernate.jpa.app;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.te.hibernate.jpa.beans.Call;

public class JPQL03 {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PersonUnit01");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		// EntityTransaction entityTransaction = entityManager.getTransaction();

		String query = "select * from call_table";
		Query nativeQuery = entityManager.createNativeQuery(query);
		List<Object[]> resultList = nativeQuery.getResultList();
		for (Object[] objects : resultList) {
			for (Object objects2 : objects) {
				System.out.println("-----------------");
				System.out.println(objects2);
			}
		}
		
	}
}
