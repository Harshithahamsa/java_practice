package com.te.javabasics.abstraction;

public class Driver {
	public void drive(Car car) {
		car.start();
		car.accelarate();
		car.brake();
		car.gps();
	}
}
