package com.leetcode.trees.validateBST;

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
		
		tree.getRoot().setData(25);
		
		System.out.println(checkBST(tree.getRoot()));
	}
	
	public static boolean checkBST(TreeNode node)
	{
		if(node == null)
			return true;
		if(node.getLeft() != null) {
			if (node.getData() <= node.getLeft().getData()) {
				System.out.println("Left:" + node.getData() + " " + node.getLeft().getData());
				return false;
			}
		}
		if(node.getRight() != null) {
			if (node.getData() >= node.getRight().getData()) {
				System.out.println("Right:" + node.getData() + " " + node.getRight().getData());
				return false;
			}
		}
		boolean rflag = true, lflag = true;
		rflag = checkBST(node.getLeft());
		lflag = checkBST(node.getRight());
		return rflag && lflag;
	}
}
