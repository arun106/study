package com.designpattern.singletonpattern;

public class SingletonPatternDemo {

	public static void main(String[] args) {
		SingleObject s = SingleObject.getInstance();
		s.showMessage();
	}

}
