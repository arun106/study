package com.test;

public class Child extends Parent {
	Child() {
		System.out.println("Child constructor");
	}
	static {
		System.out.println("Child static block");
	}
	public static void main(String args[]) {
		System.out.println("Child main method");
		Child child = new Child();
	}
}