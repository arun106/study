package com.udemy.recursion;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (long i=1; i<20; i++)
			System.out.println(i+": "+factorial(i));
	}
	
	public static long factorial (long n)
	{
		if(n == 0)
		{
			return 1;
		}
		
		return n*factorial(n-1);
	}
}
