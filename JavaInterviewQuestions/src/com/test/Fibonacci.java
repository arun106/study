package com.test;

public class Fibonacci {

	public static void main(String[] args) {
		int res[] = fibonacci(10);
		for (int i=0; i<10; i++) {
			System.out.print(res[i]+" ");
		}
	}
	public static int[] fibonacci(int n) {
		int[] output = new int[n];
		int a = 0, b = 1;
		for (int i=0; i<n; i++) {
			if (i==0) {
				output[i] = a;
			}
			else if (i == 1) {
				output[i] = b;
			}
			else {
				int sum = a+b;
				a=b;
				b=sum;
				output[i] = sum;
			}
		}
		return output;
	}
	public static int[] fibonacci(int n, int a, int b) {
		int[] output = new int[n];
		
		return output;
	}
}
