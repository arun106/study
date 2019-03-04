package com.test;

public class LinkedList {

	NodeL head;
	
	class NodeL
	{
		int data;
		NodeL next;
		NodeL(int data)
		{
			this.data=data;this.next=null;
		}
	}
	
	public void push(int newdata)
	{
		NodeL new_node=new NodeL(newdata);
		new_node.next=null;
		if(head == null)
		{
			System.out.println("Head null"+newdata);
			head=new_node;
			new_node.next=null;
		}
		NodeL tempNode=head;
		while(tempNode.next!=null)
		{
			System.out.println("Next"+newdata);
			tempNode=tempNode.next;
			System.out.println("Next data"+tempNode.data);

		}
		if(tempNode.next == null)
		tempNode.next=new_node;
		
		
	}
	
	void printlist()
	{
		NodeL temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println("Print complete!");
	}
	
	public static void main(String[] args) {
		LinkedList llist=new LinkedList();
		llist.head=null;
		llist.push(10);
		llist.push(20);
		llist.push(40);
		llist.push(50);
		llist.printlist();
	}

}
