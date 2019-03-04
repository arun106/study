package com.designpattern.abstractfactorypattern;

public class Main {

	public static void main(String[] args) {
		AbstractFactory factory = FactoryProducer.getFactory("SHAPE");
		Shape shape = factory.getShape("Square");
		shape.draw();
		
		AbstractFactory factory1 = FactoryProducer.getFactory("COLOR");
		Color color = factory1.getColor("RED");
		color.fill();
	}

}
