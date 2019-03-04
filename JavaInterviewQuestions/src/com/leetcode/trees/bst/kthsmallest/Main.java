package com.leetcode.trees.bst.kthsmallest;

public class Main {
	public static int k, value = -1, kvalue = -1;
	
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
		k = 4;
		System.out.println(kthsmallest(tree.getRoot()));
		System.out.println("value:" + value);
	}
	
	public static int kthsmallest (TreeNode node, int k) {
		kvalue = k;
		kthsmallest(node);
		return value;
	}
	
	public static int kthsmallest (TreeNode node) {
		if (node == null)
			return -1;
		kthsmallest(node.getLeft());
		if (k == 1)
		{
			k--;
			System.out.println("loop value:" + node.getData());
			value = node.getData();
			return value;
		}
		else
		{
			k--;
		}
		kthsmallest(node.getRight());
		return value;
	}
}
