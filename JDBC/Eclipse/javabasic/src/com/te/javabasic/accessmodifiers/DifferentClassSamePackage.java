package com.te.javabasic.accessmodifiers;

public class DifferentClassSamePackage {
	public static void main(String[] args) {
		AccessModifiersExample differentClass = new AccessModifiersExample();
		differentClass.defaultMethod();
		differentClass.publicMethod();
		differentClass.protecedMethod();
//		differentClass.privateMethod();
	}
}
