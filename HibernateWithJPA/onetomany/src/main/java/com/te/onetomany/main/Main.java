package com.te.onetomany.main;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.onetomany.bean.Cart;
import com.te.onetomany.bean.Product;

public class Main {
	public static void main(String[] args) {
		Product product = new Product();
		product.setId(1);
		product.setName("Mobiles");
		product.setPrice(20000);
		
		Product product2 = new Product();
		
		product2.setId(200);
		product2.setName("TV");
		product2.setPrice(25000);
		
		Cart cart = new Cart();
		cart.setId(1);
		cart.setName("cart");
		
		product.setCart(cart);
		product2.setCart(cart);
		
		ArrayList<Product> list = new ArrayList<Product>();
		
		list.add(product);
		list.add(product2);
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("twoway");
		EntityManager manager = factory.createEntityManager();
		
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		manager.persist(list);
		transaction.commit();
	}
}
