package com.Infy;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListLibrary {

	LinkedList<Integer> llist;
	
	public static void main(String[] args) {
		LinkedListLibrary linkedlist=new LinkedListLibrary();
		linkedlist.llist=new LinkedList<>();
		linkedlist.llist.add(5);
		linkedlist.llist.add(15);
		linkedlist.llist.add(25);
		
		Iterator itr=linkedlist.llist.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			System.out.println(itr.next());
				System.out.println("Test");
		}
	}

}
