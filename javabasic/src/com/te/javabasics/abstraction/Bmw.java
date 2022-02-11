package com.te.javabasics.abstraction;

public class Bmw implements Car {

	@Override
	public void start() {
		System.out.println("Bmw has started");

	}

	@Override
	public void accelarate() {
		System.out.println("bmw has accelarate");

	}

	@Override
	public void brake() {
		System.out.println("bmw has stop");

	}

}
