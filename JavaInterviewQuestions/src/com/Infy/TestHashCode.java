package com.Infy;

public class TestHashCode {

	int i, j;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestHashCode test = new TestHashCode();
		TestHashCode test1 = new TestHashCode();
		
		test.i = 5;
		test.j = 6;
		
		System.out.println(test.i+" "+test.j);
		System.out.println(test.hashCode());
		System.out.println(test1.hashCode());
		
	}

}
