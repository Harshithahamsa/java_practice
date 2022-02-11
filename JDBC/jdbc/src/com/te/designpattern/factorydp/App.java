package com.te.designpattern.factorydp;

public class App {
	public static void main(String[] args) {

		Shape shape = ShapeFactory.getShape();
		ShapeCall call = new ShapeCall();
		call.shapeCallMethod(shape);
 
	}
}
