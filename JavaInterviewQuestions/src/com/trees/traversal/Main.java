package com.trees.traversal;

import java.util.Stack;

/* 
 * 
 * Tree traversal without recursion
 * */

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
		
		System.out.println("Inorder - No Recursion");
		inorder(tree.getRoot());
		System.out.println("Inorder - Recursion");
		inorderrec(tree.getRoot());
		System.out.println();
		
		System.out.println("Preorder - No Recursion");
		preorder(tree.getRoot());
		System.out.println("Preorder - Recursion");
		preorderrec(tree.getRoot());
		System.out.println();

		System.out.println("Postorder - Recursion");
		postorderrec(tree.getRoot());
	}
	
	public static void postorder(TreeNode node) {
		
		
		
	}
	
	public static void postorderrec(TreeNode node) {
		if(node == null)
			return;
		preorderrec(node.getLeft());
		preorderrec(node.getRight());
		System.out.print(node.getData() + " ");
	}
	
	public static void inorderrec(TreeNode node) {
		if(node == null)
			return;
		preorderrec(node.getLeft());
		System.out.print(node.getData() + " ");
		preorderrec(node.getRight());
	}
	public static void inorder(TreeNode node) {
		Stack<TreeNode> stack = new Stack<>();
		TreeNode nodex = node;
		
		while (nodex != null || !stack.isEmpty()) {
			if (nodex != null) {
				stack.push(nodex);
				nodex = nodex.getLeft();
			}
			else {
				nodex=stack.pop();
				System.out.print(nodex.getData()+ " ");
				nodex=nodex.getRight();
			}
		}
		System.out.println();
	}
	
	public static void preorderrec(TreeNode node) {
		if(node == null)
			return;
		System.out.print(node.getData() + " ");
		preorderrec(node.getLeft());
		preorderrec(node.getRight());
	}
	
	public static void preorder(TreeNode node) {
		Stack<TreeNode> stack = new Stack<>();
		TreeNode nodex = node;
		
		while (nodex != null || !stack.isEmpty()) {
			if (nodex != null) {
				System.out.print(nodex.getData()+ " ");
				stack.push(nodex);
				nodex = nodex.getLeft();
			}
			else {
				nodex=stack.pop();
				nodex=nodex.getRight();
			}
		}
		System.out.println();
	}

}
