package com.leetcode.trees.BTmaxdepth;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		System.out.println();
		System.out.println(maxDepth(tree.getRoot()));
	}
	
	public static int maxDepth(TreeNode node) {
	    if(node == null) {
	    	return 0;
	    }
	    int ldepth = 1, rdepth = 1;
	    if(node.getLeft() != null) {
	    	ldepth = 1 + maxDepth(node.getLeft());
	    }
	    if(node.getRight() != null) {
	    	rdepth = 1 + maxDepth(node.getRight());
	    }
	    return Math.max(ldepth, rdepth);
	}

}
