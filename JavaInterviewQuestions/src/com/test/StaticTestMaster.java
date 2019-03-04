/**
 * 
 */
package com.test;

/**
 * @author Arun Mohan
 *
 */
public class StaticTestMaster {
	
	static int j;
	static {
		int i = 10;
		j=5;
		System.out.println("StaticTestMaster - static block");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
