package com.designpattern.facadepattern;

public class FacadePatternDemo {

	public static void main(String[] args) {
		ShapeMaker shapemaker = new ShapeMaker();
		shapemaker.drawCircle();
		shapemaker.drawSquare();;
		shapemaker.drawRectangle();
	}
}
