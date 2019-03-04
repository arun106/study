package com.test;

public class HashCodeExample {
	
	public static void main(String args[])
	{
		Employee emp1 = new Employee(100,"Arun");
		Employee emp2 = new Employee(101,"Arya");
		Employee emp3 = new Employee(100,"Arun");
		
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(emp3.hashCode());
		
		if(emp1.equals(emp3))
			System.out.println("True");

	}
}
