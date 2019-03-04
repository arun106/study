package com.leetcode.trees.traversal.inorder;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(20);
		root.left = new TreeNode (10);
		root.right = new TreeNode (30);
		root.left.left = new TreeNode (1);
		root.right.right = new TreeNode (40);
		
		System.out.println(inorderTraversal(root));
	}
	
	public static List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		inorderTraversal(root, list);
		return list;
    }
	
	public static void inorderTraversal(TreeNode root, List<Integer> list) {
		if (root == null)
			return;
		inorderTraversal(root.left, list);
		list.add(root.val);
		inorderTraversal(root.right, list);
	}

}
