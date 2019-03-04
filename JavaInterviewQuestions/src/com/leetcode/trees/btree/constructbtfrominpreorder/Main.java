package com.leetcode.trees.btree.constructbtfrominpreorder;

public class Main {

	public static void main(String[] args) {
		
		int[] preorder = {3,9,20,15,7};
		int[] inorder = {9,3,15,20,7};
		TreeNode node = buildTree(preorder, inorder);
		inorder(node);
	}
	
	public static TreeNode buildTree(int[] preorder, int[] inorder) {
		return buildTree(0, 0, inorder.length-1, preorder, inorder);
    }
	
	public static TreeNode buildTree(int prestart, int instart, int inend, int[] preorder, int[] inorder) {    
		if(prestart > preorder.length-1 || instart > inend) {
			return null;
		}
		TreeNode root = new TreeNode(preorder[prestart]);
		int inIndex = 0;
		for (int i = instart; i<=inend; i++) {
			if (inorder[i] == root.val) {
				inIndex = i;
				break;
			}
		}
		root.left = buildTree (prestart+1, instart, inIndex-1, preorder, inorder);
		root.right = buildTree (prestart + inIndex - instart + 1, inIndex + 1, inend, preorder, inorder);
		return root;
    }
	
	public static void inorder(TreeNode node) {
		if (node == null)
			return;
		
		inorder(node.left);
		System.out.print(node.val+" ");
		inorder(node.right);
	}

}
