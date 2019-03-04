/**
 * 
 */
package com.test;

/**
 * @author Arun Mohan
 *
 */
public class StaticTestChild extends StaticTestMaster {

	static {
		System.out.println("StaticTestChild - static block");
		System.out.println("StaticTestChild##j - "+StaticTestMaster.j);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("StaticTestChild##main - "+StaticTestChild.j);
	}

}
