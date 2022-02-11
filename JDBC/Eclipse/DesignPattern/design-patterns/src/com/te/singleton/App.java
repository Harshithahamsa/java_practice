package com.te.singleton;

public class App {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getSingletonObject();
		System.out.println(singleton);
		
		Singleton singleton02 = Singleton.getSingletonObject();
		System.out.println(singleton02);
		
		if (singleton.equals(singleton02))
			System.out.println("Same object!");
	}
}
