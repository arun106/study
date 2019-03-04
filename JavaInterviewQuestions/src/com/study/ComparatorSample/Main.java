package com.study.ComparatorSample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> li = new ArrayList<Student>();
		li.add(new Student(1,"Arun",32));
		li.add(new Student(2,"Arya",28));
		li.add(new Student(3,"Ammu",35));
		
		Collections.sort(li, new Student());
		for (Student s:li)
			System.out.println(s.rollno+" "+s.name+" "+s.age);
	}
	
	
}

class Student implements Comparator
{
	int rollno;
	String name;
	int age;
	public Student() {

	}
	
	public Student(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	
	public int compare (Object o1, Object o2) {
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;
		return s1.age-s2.age;
	}
	
}