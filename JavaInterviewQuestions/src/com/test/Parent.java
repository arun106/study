package com.test;

public class Parent {
	Parent() {
		System.out.println("Parent constructor");
	}
	static {
		System.out.println("Parent - static block");
	}
}