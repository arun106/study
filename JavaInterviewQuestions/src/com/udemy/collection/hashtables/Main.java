package com.udemy.collection.hashtables;

import java.util.HashMap;
import java.util.Map;

import com.udemy.collection.Employee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee(1,"Arun");
		Employee emp2 = new Employee(2,"Arya");
		
		Map<String, Employee> hashmap = new HashMap<>();
		hashmap.put("Mohan", emp1);
		hashmap.put("Soman", emp2);
		
		hashmap.forEach((k,v) -> System.out.println("Key = " + k + " , Employee: " + v));
		
	}

}
