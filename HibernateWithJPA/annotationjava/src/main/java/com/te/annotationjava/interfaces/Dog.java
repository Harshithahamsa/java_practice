package com.te.annotationjava.interfaces;

public class Dog implements Animal{

	@Override
	public void eat() {
		System.out.println("Dog eat dog-food");
		
	}

	@Override
	public void speak() {
		System.out.println("Dog speak bark");
		
	}
	
}
