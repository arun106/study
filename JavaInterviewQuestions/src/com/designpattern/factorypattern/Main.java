package com.designpattern.factorypattern;

public class Main {

	public static void main(String[] args) {
		ShapeFactory shapefactory = new ShapeFactory();
		Shape shape1 = shapefactory.getShape("Square");
		shape1.draw();
		
		Shape shape2 = shapefactory.getShape("Circle");
		shape2.draw();
		
		Shape shape3 = shapefactory.getShape("Rectangle");
		shape3.draw();
	}
}
