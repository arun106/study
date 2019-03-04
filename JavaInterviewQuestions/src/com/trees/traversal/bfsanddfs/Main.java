package com.trees.traversal.bfsanddfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(4);
		root.right = new TreeNode(6);
		root.left.left = new TreeNode(3);
		root.right.right = new TreeNode(7);
		inorder(root);
		System.out.println("BFS - >");
		bfs(root);
		System.out.println();
		System.out.println("DFS->");
		dfs(root);
		/*
		 * 			5
		 * 		4		6
		 * 	3				7
		 */
	}
	
	public static void bfs(TreeNode node) {
		if (node == null) {
			return;
		}
		Queue<TreeNode> queue = new LinkedList();
		queue.add(node);
		
		while(!queue.isEmpty()) {
			TreeNode nodex = queue.poll();
			System.out.print(nodex.data+" ");
			if(nodex.left != null) {
				queue.add(nodex.left);
			}
			if(nodex.right != null) {
				queue.add(nodex.right);
			}
		}
	}
	
	public static void dfs(TreeNode node) {
		if (node == null) {
			return;
		}
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(node);
		while (!stack.isEmpty()) {
			TreeNode nodex = stack.pop();
			System.out.print(nodex.data+" ");
			if (nodex.left != null) {
				stack.push(nodex.left);
			}
			if(nodex.right != null) {
				stack.push(nodex.right);
			}
		}
	}
	public static void inorder(TreeNode node) {
		if(node == null)
			return;
		inorder(node.left);
		System.out.print(node.data+" ");
		inorder(node.right);
	}

}
