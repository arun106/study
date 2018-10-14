package com.salesforce;

public class Test {
	public static void main(String[] args) {
		String str = " A  B  C";
		System.out.println(str.trim().replaceAll(" +", " "));
		System.out.println(str);
	}
}
