package com.test;

import java.util.Scanner;

public class StackExample {

	static String str1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*StringBuffer s = new StringBuffer("A B C D E");
		
		//LinkedList list= new LinkedList();
		
		System.out.println(s.reverse());
		
		StringBuilder s1=new StringBuilder("A B C");
		
		System.out.println(s1.reverse());
		
		StringBuffer s2 = new StringBuffer("abcde");
		StringBuilder s3 = new StringBuilder("abcde");
		String s4 = new String("abcde");
		String s5 = "abcde";
		
		if(s2.equals(s3))
			System.out.println("1");
		if(s2.equals(s4))
			System.out.println("2");
		if(s2.equals(s5))
			System.out.println("3");
		if(s3.equals(s2))
			System.out.println("4");
		if(s3.equals(s4))
			System.out.println("5");
		if(s3.equals(s5))
			System.out.println("6");
		if(s4.equals(s2))
			System.out.println("7");
		if(s4.equals(s3))
			System.out.println("8");
		if(s4.equals(s5))
			System.out.println("9");
		if(s5.equals(s2))
			System.out.println("10");
		if(s5.equals(s3))
			System.out.println("11");
		if(s5.equals(s4))
			System.out.println("12");
		s5 = "xyz";
		
		System.out.println(s5);
		s2 = s2.reverse();
		System.out.println(s2);
		s5 = s5.concat("a");
		System.out.println(s5);*/
		
		/*String str = new String("Arun");
		str1 = "Aparna";
		
		System.out.println(str+" "+str1);
		
		changestr(str);
		
		System.out.println(str+" "+str1);*/
		
		StringBuilder s1=new StringBuilder("ABCDEF");
		
		s1.append("XYZ");
		
		System.out.println(s1.reverse());
		
		s1.reverse();
		
		String s2 = new String(s1);
		
		System.out.println(s2);
		
		System.out.println(Character.getNumericValue("ABCDE".charAt(1)));
		
		Scanner s = new Scanner(System.in);
		String s3 = s.nextLine();
		
		System.out.println("You have entered:"+s3);
	}
	
	static void changestr(String str)
	{
		str = "Arya";
		str1= "Ammu";
		
	}

}
