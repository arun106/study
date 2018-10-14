package com.Infy;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		
//		for(Integer j:al) //java.util.ConcurrentModificationException
//		{
//			if(j==2)
//				al.remove(j);
//		}
		System.out.println(al);
		
		Iterator itr = al.iterator();

		while(itr.hasNext())
		{
			int i = (Integer) itr.next();
			
			if(i==3)
				itr.remove();
		}
		System.out.println(al);
		
		
		
		
	}

}
