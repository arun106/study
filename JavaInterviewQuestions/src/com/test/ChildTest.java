package com.test;

public class ChildTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Master master = new Master();
		Child child = new Child();
		
		System.out.println(master.i);
		System.out.println(child.i);
		System.out.println(child.j);
		
		master.printMaster();
		master.printBoth();
		child.printMaster();
		child.printchild();
		child.printBoth();
	}

}
