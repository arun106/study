package com.leetcode.trees.symmetrictree;

public class Main {
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.setLeft(new TreeNode(2));
		root.setRight(new TreeNode(2));
		root.getLeft().setLeft(new TreeNode(5));
		root.getRight().setRight(new TreeNode(5));
		
		System.out.println(issymmetric(root, root));
	}
	
	public static boolean issymmetric (TreeNode node1, TreeNode node2) {
		
		if (node1 == null && node2 == null)
			return true;
		if (node1 != null && node2 != null
				&& node1.getData() == node2.getData()) {
			return issymmetric(node1.getLeft(), node2.getRight()) && 
					issymmetric(node1.getRight(), node2.getLeft());
		}
		return false;
	}
}
