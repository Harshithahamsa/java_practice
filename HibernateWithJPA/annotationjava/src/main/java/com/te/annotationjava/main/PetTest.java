package com.te.annotationjava.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.annotationjava.bean.Pet;
import com.te.annotationjava.config.AllConfigFile;

public class PetTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AllConfigFile.class);
		Pet pet = (Pet) context.getBean("pet1");
		System.out.println(pet.getP_name());
		pet.getAnimal().eat();
		pet.getAnimal().speak();
		

	}
}
