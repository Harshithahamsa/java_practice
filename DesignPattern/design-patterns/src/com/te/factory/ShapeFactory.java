package com.te.factory;

public class ShapeFactory {
	public Shape getShape(String shape) {
		if (shape.equalsIgnoreCase("Triangle"))
			return new Triangle();
		else if (shape.equalsIgnoreCase("Rectangle"))
			return new Rectangle();
		else if (shape.equalsIgnoreCase("Circle"))
			return new Circle();
		else
			return null;

	}

}
