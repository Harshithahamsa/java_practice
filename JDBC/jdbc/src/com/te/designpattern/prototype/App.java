package com.te.designpattern.prototype;

public class App {
	public static void main(String[] args) throws CloneNotSupportedException {
		ComplexObjectClass classComplexObjectClass = new ComplexObjectClass(1, 2, 3, 4, 5, 6, 1, 2, 3, 4);
		System.out.println(classComplexObjectClass);
		
		ComplexObjectClass clone =(ComplexObjectClass) classComplexObjectClass.clone();
		System.out.println(clone);
		if (clone.equals(classComplexObjectClass)) {
			System.out.println("same object");
		} else {
			System.out.println("not same object but different attribute");
		}
	}
}
