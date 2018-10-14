package com.Infy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestFirst {

	
	public static void main(String[] args) {
		
		/*TestFirst test = new TestFirst();
		//test.arrayMethod();
		//test.kLargestElements();
		
		ArrayList<Integer> al=new ArrayList<>();
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(1);
		
		System.out.println(al);*/
		
		String str = "string";
		char[] carr = str.toCharArray();
		
		System.out.println(carr);
	}
	
	private void kLargestElements()
	{
		int k=5;
		int[] s={1,2,3,5,7,11,13,17,4,19};
		Arrays.sort(s);
		for (int i=0; i<s.length;i++)
			System.out.println(s[i]);
		
		for (int i=s.length-1;i>=s.length - k;i--)
			System.out.println("K largest:" + s[i]);
		
		
	}
	
	private void arrayMethod()
	{
		int[] s={1,2,3,5,7,11,13,17,2,5};
		
		boolean found=false;
		
		for(int i=0; i<s.length;i++)
		{
			found=false;
			for(int j=0;j<i;j++)
			{
				if(s[i]==s[j])
					found=true;
			}
			if(!found)
				System.out.println(s[i]);
		}	
	}

}
