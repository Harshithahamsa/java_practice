package com.te.annotationjava.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.annotationjava.bean.Person;

public class PersonMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("annotation.xml");
		Person person = (Person) applicationContext.getBean("person");
		System.out.println(person);
		
		Person person1 = (Person) applicationContext.getBean("person1");
		System.out.println(person1);
	}
}
