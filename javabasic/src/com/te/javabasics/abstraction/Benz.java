package com.te.javabasics.abstraction;

public class Benz implements Car{

	@Override
	public void start() {
		System.out.println("Benz has started");
		
	}

	@Override
	public void accelarate() {
		System.out.println("benz has accelarated");
		
	}

	@Override
	public void brake() {
		System.out.println("benz has stoped");
	}
	
//	@Override
	public void gps() {
		System.out.println("Gps Is present in benz");
	}

}
