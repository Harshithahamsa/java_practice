package com.te.hibernate.jpa.app;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.hibernate.jpa.beans.Human;
import com.te.hibernate.jpa.beans.Pet;

public class Insert {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PersonUnit01");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Human human = new Human();
		human.setHumanName("Human01");
		
		Human human02 = new Human();
		human02.setHumanName("Human02");
		
		Pet pet = new Pet();
		pet.setPetName("Pet01");
		
		Pet pet02 = new Pet();
		pet02.setPetName("Pet02");
		
		ArrayList<Pet> petList  = new ArrayList<Pet>();
		petList.add(pet);
		petList.add(pet02);
		
		ArrayList<Human> humanList = new ArrayList<Human>();
		humanList.add(human);
		humanList.add(human02);
		
		human.setPets(petList);
		human02.setPets(petList);
		
		pet.setHumans(humanList);
		pet02.setHumans(humanList);
		
		
		entityTransaction.begin();
		entityManager.persist(human);
		entityManager.persist(human02);
		entityTransaction.commit();
	}	
}
