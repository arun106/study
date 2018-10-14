package com.Infy.Old;

import java.util.ArrayList;

public class BinarySearchTree {

	private ArrayList<String> aList;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree testFirst = new BinarySearchTree();
		testFirst.aList = new ArrayList();
		
		testFirst.aList.add("10");
		testFirst.aList.add("20");
		testFirst.aList.add("R");
		testFirst.aList.add("10");
		testFirst.aList.add("30");
		testFirst.aList.add("R");
		testFirst.aList.add("20");
		testFirst.aList.add("40");
		testFirst.aList.add("R");
		testFirst.aList.add("20");
		testFirst.aList.add("60");
		testFirst.aList.add("L");
		
		int i=1, a=0, b=0;
		boolean flag=true;
		for (String s:testFirst.aList)
		{
			System.out.println("Processing "+s);
			if(i==1)
			{
				a=Integer.parseInt(s);	
				i++;
			}
			else if(i==2)
			{
				b=Integer.parseInt(s);
				i++;
			}
			else if(i==3)
			{
				if(s.equalsIgnoreCase("L"))
				{
					if(a<b)
					{
						System.out.println("Not a BST");
						flag=false;
						break;
					}
				}
				else
				{
					if(a>b)
					{
						System.out.println("Not a BST");
						flag=false;
						break;
					}
				}
				i=1;
			}
		}
		
		if(flag)
			System.out.println("Binary search tree!!");
	}

}
