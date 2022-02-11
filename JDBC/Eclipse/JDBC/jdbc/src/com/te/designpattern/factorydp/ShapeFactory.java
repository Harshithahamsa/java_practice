package com.te.designpattern.factorydp;

public class ShapeFactory {
	public static Shape getShape (String input) {
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

//	private Shape Circle() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	private Shape Tringle() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	private Shape Rectangle() {
//		// TODO Auto-generated method stub
//		return null;
//	}
}
