package com.te.designpattern.singleton;

public class App {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getSingletonObject();
		System.out.println(singleton);
		
		Singleton singleton2 = Singleton.getSingletonObject();
		System.out.println(singleton2);
		System.out.println();
	}
}
