package com.test;

public class Child extends Master {
	public Integer i = 25;
	public Integer j = 45;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		Master master = new Child();
		System.out.println(child.i);
		System.out.println(master.i);
		
		System.out.println(child.j);

		child.printchild();
		child.printMaster();
		child.printBoth();
		
		master.printMaster();
		master.printBoth();
		
	}
	
	void printchild()
	{
		System.out.println("Im child");
	}

	void printBoth()
	{
		System.out.println("Im child - both");
	}
}
