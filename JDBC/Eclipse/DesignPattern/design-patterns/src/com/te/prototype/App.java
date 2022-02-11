package com.te.prototype;

public class App {
	public static void main(String[] args) throws CloneNotSupportedException {
		ComplexObjectClass complexObject = new ComplexObjectClass(1, 2, 3, 4, 5, 6, 1, 2, 3, 4);
		System.out.println(complexObject);
		
		ComplexObjectClass clone = (ComplexObjectClass) complexObject.clone();
		System.out.println(clone);
		
		if (clone.equals(complexObject))
			System.out.println("Same object!");
		else 
			System.out.println("Not same object, but same attributes!");
	}
}
