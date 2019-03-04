package com.udemy.collection.binarysearchtree;

public class Main {

	public static void main(String[] args) {

		Tree tree = new Tree();
		tree.insert(20);
		tree.insert(25);
		tree.insert(5);
		tree.insert(15);
		tree.insert(27);
		tree.insert(17);
		tree.insert(19);
		tree.insert(21);
		tree.insert(7);
		
		tree.inorder();
		

	}

}
