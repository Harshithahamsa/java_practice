package com.te.annotationjava.interfaces;

public class Cat implements Animal{

	@Override
	public void eat() {
		System.out.println("Cat eat fish");
		
	}

	@Override
	public void speak() {
		System.out.println("cat mewoing");
		
	}

}
