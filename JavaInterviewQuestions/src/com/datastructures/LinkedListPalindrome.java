package com.datastructures;


public class LinkedListPalindrome {

	Node head;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListPalindrome llist=new LinkedListPalindrome();
		llist.head=null;
		Node node = new Node(5);
		llist.head = node;
		llist.head.next = new Node(10);
		llist.head.next.next = new Node(20);
		llist.head.next.next.next = new Node(20);
		llist.head.next.next.next.next = new Node(10);
		llist.head.next.next.next.next.next = new Node(5);

		
		llist.printlist(llist.head);
		llist.checkpalindrome(llist.head);
	}
	public void printlist(Node node)
	{
		while(node != null)
		{
			System.out.print(node.data+"->");
			node = node.next;
		}
	}
	
	public void checkpalindrome(Node node)
	{
		Node head = node, fast=node, slow=node;
		while(fast.next != null)
		{
			fast = fast.next;
			if(fast.next != null)
			{
				slow = slow.next;
				fast=fast.next;
			}
		}
		fast = slow;
		slow = slow.next;
		fast.next = null;
		
		slow = findMid(slow);
		
		while(slow!=null && head!=null)
		{
			System.out.println("head.data"+head.data);
			System.out.println("temp.data"+slow.data);

			if(head.data != slow.data)
			{
				System.out.println("Not a palindrome");
				return;
			}
			head = head.next;
			slow = slow.next;
		}
		System.out.println("Palindrome");
	}
	public Node findMid(Node slow)
	{
		Node prev=null, front=null;
		System.out.println("Print mid");
		printlist(slow);
		
		prev = null;
		front = slow.next;

		while(front != null)
		{
			slow.next = prev;
			prev = slow;
			slow = front;
			front = front.next;
			//temp=slow;
		}
		slow.next = prev;
		
		System.out.println("Print mid");
		printlist(slow);
		
		return null;
	}

}
