package com.study.priorityqueuesample;

import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> queue = new PriorityQueue();
		queue.add(20);
		queue.add(10);
		queue.add(30);
		queue.add(40);
		queue.add(5);
		System.out.println(queue);
		System.out.println(queue.poll());
		
	}

}
