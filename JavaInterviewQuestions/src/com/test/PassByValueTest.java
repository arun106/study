package com.test;

public class PassByValueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PassByValueTest test = new PassByValueTest();
		Node node = new Node(5);
		System.out.println(node.data);
		test.changeValue(node);
		System.out.println(node.data);
	}
	
	private void changeValue(Node node)
	{
		node.data = 10;
	}

}
