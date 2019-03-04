package com.test;

public class SwapTwoNumNoTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=12, y=22;
		System.out.println(x+" "+y);
		x=x+y;
		y=x-y; //x+y-y -> y=x
		x=x-y; //x+y-x -> x=y
		System.out.println(x+" "+y);
	}

}
