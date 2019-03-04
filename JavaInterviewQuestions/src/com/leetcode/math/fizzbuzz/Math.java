package com.leetcode.math.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fizzBuzz(30));
	}
	//3 - Fizz, 5 - Buzz, 3&5 - FizzBuzz
	public static List<String> fizzBuzz(int n) {
        if(n <= 0)
        	return null;
		List<String> li = new ArrayList<String>();
		
        for (int i=1; i<=n; i++) {
        	if (i%3 == 0 && i%5 == 0) {
        		li.add("FizzBuzz");
        	} else if(i%3 == 0) {
        		li.add("Fizz");
        	} else if(i%5 == 0) {
        		li.add("Buzz");
        	} else {
        		li.add(String.valueOf(i));
        	}
        }
		return li;
    }
}
