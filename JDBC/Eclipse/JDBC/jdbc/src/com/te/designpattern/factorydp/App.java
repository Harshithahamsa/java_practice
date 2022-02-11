package com.te.designpattern.factorydp;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		String input = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a string");
		input = scanner.next();
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape shape = shapeFactory.getShape(input);
		shape.getShapeInfo();
	}
}
