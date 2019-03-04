package com.study.ComparableSample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> li = new ArrayList<Student>();
		li.add(new Student(1,"Arun",32));
		li.add(new Student(2,"Arya",28));
		li.add(new Student(3,"Ammu",35));
		
		Collections.sort(li);
		for (Student s:li)
			System.out.println(s.rollno+" "+s.name+" "+s.age);
	}

}

class Student implements Comparable<Student>
{
	int rollno;
	String name;
	int age;

	public Student(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	public int compareTo (Student st) {
		/*if (age == st.age) {
			return 0;
		}
		else if (age > st.age) {
			return 1;
		}
		else {
			return -1;
		}*/
		return age-st.age;
	}
	
}
