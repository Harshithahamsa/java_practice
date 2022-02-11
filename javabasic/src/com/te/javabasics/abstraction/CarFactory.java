package com.te.javabasics.abstraction;

import java.util.Scanner;

public class CarFactory {
	public static Car getCar() {
		System.out.println("Enter the name of the Car :");
		Scanner scanner = new Scanner(System.in);

		String carName = scanner.next();

		if (carName.equalsIgnoreCase("bmw")) {
			return new Bmw();
		} else if (carName.equalsIgnoreCase("benz")) {
			return new Benz();
		}
		return null;
	}
}
