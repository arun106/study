package com.udemy.collection.jdklinkedlist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import com.udemy.collection.Employee;

public class Main {

	public static void main(String[] args) {

		Employee emp1 = new Employee(1,"Arun");
		Employee emp2 = new Employee(2,"Arya");
		
		LinkedList<Employee> list = new LinkedList<>();
		list.addFirst(emp1);
		list.addFirst(emp2);
		
		//System.out.println(list.pop());
		//System.out.println(list.pop());
		//System.out.println(list.pop());
		
		
		Stack<Employee> stack = new Stack<>();
		stack.push(emp1);
		stack.push(emp2);
		System.out.println(stack.get(0));
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		System.out.println(stack);
		/*List<List<String>> list1 = new ArrayList<List<String>>();
		HashMap<String,List<String>> map = new HashMap();
		new ArrayList<List<String>>(map.values());*/
		
	}

}
