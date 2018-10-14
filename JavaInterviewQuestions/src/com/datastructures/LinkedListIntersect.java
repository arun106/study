package com.datastructures;

/**
 * @author Arun Mohan
 *
 */
public class LinkedListIntersect {

	Node n1, n2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListIntersect llist=new LinkedListIntersect();
		llist.n1=null;
		Node node = new Node(5);
		llist.n1 = node;
		llist.n1.next = new Node(10);
		llist.n1.next.next = new Node(15);
		llist.n1.next.next.next = new Node(20);
		Node temp = new Node(1000);
		llist.n1.next.next.next.next = temp;
		llist.n1.next.next.next.next.next = new Node(30);

		llist.n2=null;
		node = new Node(100);
		llist.n2 = node;
		llist.n2.next = new Node(200);
		llist.n2.next.next = new Node(300);
		llist.n2.next.next.next = temp;
		
		System.out.println("Printing node:n1");
		llist.printlist(llist.n1);
		
		System.out.println("Printing node:n2");
		llist.printlist(llist.n2);
		
		int intersection = llist.checkLLIntersect(llist.n1, llist.n2);
		if(intersection != -1)
		{
			System.out.println("Nodes interset at "+intersection);
		}
		else
		{
			System.out.println("Nodes doesn't interset!");
		}
	}
	public int checkLLIntersect(Node n1, Node n2)
	{
		int length1 = 0, length2 = 0, diff = 0;
		length1 = findLengthLL(n1);
		length2 = findLengthLL(n2);
		
		if(length1 >= length2)
		{
			diff = length1-length2;
			while(diff > 0)
			{
				n1 = n1.next;
				diff--;
			}
		}
		else
		{
			diff = length2-length1;
			while(diff > 0)
			{
				n2 = n2.next;
				diff--;
			}
		}
		while (n1!=null || n2!=null)
		{
			if(n1 == n2)
				return n1.data;
			n1 = n1.next;
			n2 = n2.next;
		}
		return -1;
	}
	
	public int findLengthLL(Node n1)
	{
		int length = 0;
		while(n1 != null)
		{
			length++;
			n1 = n1.next;
		}
		return length;
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
