package com.leetcode.trees.btlevelordertraversal;

public class Main {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.setLeft(new TreeNode(2));
		root.setRight(new TreeNode(2));
		root.getLeft().setLeft(new TreeNode(5));
		root.getRight().setRight(new TreeNode(5));
		
		levelOrder(root);
		
	}
	
	public static void levelOrder (TreeNode node) {
		if (node == null) {
			return;
		}
		int height = height(node);
		System.out.println("Height: " + height(node));
		for (int i = 1; i<=height; i++) {
			printLevel(node, i);
		}
	}
	public static int height(TreeNode node) {
		if(node == null) {
	    	return 0;
	    }
	    int ldepth = 1, rdepth = 1;
	    if(node.getLeft() != null) {
	    	ldepth = 1 + height(node.getLeft());
	    }
	    if(node.getRight() != null) {
	    	rdepth = 1 + height(node.getRight());
	    }
	    return Math.max(ldepth, rdepth);
	}
	public static void printLevel(TreeNode node, int level) {
		if (node == null)
			return;
		if (level == 1)
			System.out.print(node.getData() + " ");
		if (level > 1)
		{
			printLevel(node.getLeft(),level-1);
		}
	}
}
