package com.test;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> pQueue = new PriorityQueue<String>(); 

		// Adding items to the pQueue using add() 
		pQueue.add("C"); 
		pQueue.add("Java"); 
		pQueue.add("CPP"); 
		pQueue.add("Python"); 


		// Printing the most priority element 
		Iterator itr = pQueue.iterator(); 
		while (itr.hasNext()) 
			System.out.println(itr.next()); 
	}

}
