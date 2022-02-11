package com.te.singleton;

public class Singleton {
	private static Singleton singleton;
	
	private Singleton() {
		
	}
	
	public static synchronized Singleton getSingletonObject() {
		if (singleton == null) {
			System.out.println("Singleton object created for the first time!");
			singleton = new Singleton();
			return singleton;
		} else {
			System.out.println("Reusing existing Singleton object");
			return singleton;
		}
	}
}
