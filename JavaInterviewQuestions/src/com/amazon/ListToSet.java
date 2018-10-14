package com.amazon;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ListToSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> li = new ArrayList<>();
		
		li.add("my name is arun");
		li.add("my name is arun");
		li.add("my name is my");
		li.add("name arun name");

		System.out.println(li);
		
		Set<String> strSet = new HashSet<>();
		strSet.addAll(li);
		System.out.println(strSet);
	}

}
