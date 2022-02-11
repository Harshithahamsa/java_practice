package com.te.designpattern.factorydp;

import java.util.Scanner;

public class ShapeFactory {
	public static Shape getShape () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a string");
		String input = scanner.next();
		
		if ("rectangle".equalsIgnoreCase(input)) {
			return new Rectangle();
		}
		if ("circle".equalsIgnoreCase(input)) {
			return new Circle();
		}
		if ("tringle".equalsIgnoreCase(input)) {
			return new Tringle();
		}
		return null;
		
	}

}
