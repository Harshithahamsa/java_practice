package com.te.hibernate.jpa.app;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.hibernate.jpa.beans.Call;
import com.te.hibernate.jpa.beans.SmartPhone;

public class Insert {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PersonUnit01");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Call call = new Call();
		call.setCallNumber(23456789L);
		call.setCallUserName("UN01");
		
		Call call02 = new Call();
		call02.setCallNumber(23456785679L);
		call02.setCallUserName("UN02");
		
		ArrayList<Call> arrayList = new ArrayList<Call>();
		arrayList.add(call);
		arrayList.add(call02);
		
		SmartPhone phone = new SmartPhone();
		phone.setSmName("Apple");
		phone.setCallList(arrayList);
		
		call.setPhone(phone);
		call02.setPhone(phone);
		
		entityTransaction.begin();
		entityManager.persist(phone);
		entityTransaction.commit();
	}	
}
