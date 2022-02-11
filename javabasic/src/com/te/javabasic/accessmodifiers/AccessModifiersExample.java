package com.te.javabasic.accessmodifiers;

public class AccessModifiersExample {
	public void publicMethod(){
		System.out.println("Inside Public Method");
	}
	
	protected void protecedMethod() {
		System.out.println("Inside private method");
	}
	
	void defaultMethod() {
		System.out.println("Inside Default method ");
	}
	
	private void privateMethod() {
		System.out.println("Inside private method");
	}
	
	public static void main(String[] args) {
		AccessModifiersExample sameClass = new AccessModifiersExample();
		sameClass.privateMethod();
		sameClass.publicMethod();
		sameClass.protecedMethod();
		sameClass.defaultMethod();
	}
}
