package com.interviews.pp;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		li.add(1); li.add(0);li.add(0);li.add(1);li.add(0);
		//li.add(1); li.add(1);li.add(1);li.add(0);li.add(1);
		
		System.out.println(exam(li));
	}
	public static int exam(List<Integer> v) {
	    // Write your code here
		if (v == null) 
			return 0;
		List<Integer> myli = new ArrayList<Integer>(); 
		List<Integer> fli = new ArrayList<Integer>(); 
		
		int sum = 0;
		myli.add(0);
		for (int i:v) {
			if(i==0) {
				sum--;
			}
			else if (i == 1){
				sum++;
			}
			myli.add(sum);
		}
		sum=0;
		int res = 0;
		fli.add(0);
		for (int i=v.size()-1; i>=0; i--) {
			if(v.get(i)==0) {
				sum--;
			}
			else if (v.get(i) == 1){
				sum++;
			}
			fli.add(sum);
		}
		System.out.println(myli);
		System.out.println(fli);
		int i = 0;
		while(i < myli.size() && i < fli.size()) {
			if(myli.get(i) > fli.get(fli.size()-i-1)) {
				return res;
			}
			res++;
			i++;
		}
		return res;
	}
}
