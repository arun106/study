package com.datastructures;

public class LinkedListLoop {

	Node node;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedListLoop llist=new LinkedListLoop();
		llist.node=null;
		Node node = new Node(5);
		llist.node = node;
		llist.node.next = new Node(10);
		Node newnode = new Node(15);
		llist.node.next.next = newnode;
		llist.node.next.next.next = new Node(20);
		llist.node.next.next.next.next = new Node(25);
		llist.node.next.next.next.next.next = new Node(30);
		llist.node.next.next.next.next.next.next = new Node(35);
		llist.node.next.next.next.next.next.next.next = newnode;

		//System.out.println("Printing node:n2");
		//llist.printlist(llist.n);
		
		if(llist.checkLoop(node))
			System.out.println("Looping..");
		else
			System.out.println("No loop!");
	}
	
	public boolean checkLoop(Node node)
	{
		Node fast=node, slow = node;
		while (fast != null)
		{
			slow = slow.next;
			fast = fast.next;
			if(fast != null)
				fast = fast.next;
			
			if(slow == fast)
				return true;
		}
		return false;
	}
	
	public void printlist(Node node)
	{
		while(node != null)
		{
			System.out.print(node.data+"->");
			node = node.next;
		}
	}
}
