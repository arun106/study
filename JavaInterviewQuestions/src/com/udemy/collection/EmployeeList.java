package com.udemy.collection;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1,"Arun"));
		empList.add(new Employee(2,"Arya"));
		empList.add(new Employee(3,"Ammu"));
		
		//System.out.println(empList);
		
		//Lambda expression
		empList.forEach(employee -> System.out.println(employee));
	}

}
