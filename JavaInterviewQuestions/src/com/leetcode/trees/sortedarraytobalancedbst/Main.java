package com.leetcode.trees.sortedarraytobalancedbst;

import com.leetcode.trees.btlevelordertraversal.TreeNode;

public class Main {

	public static void main(String[] args) {
		int[] arr= {1, 2, 3, 4, 5, 6, 7};
		
		TreeNode root = convertsortedarraytobalbst(arr,0,6);
		inOrder(root);
	}
	
	public static TreeNode convertsortedarraytobalbst(int[] arr, int start, int end) {
		if(start > end) {
			return null;
		}
		int mid = (start+end)/2;
		
		TreeNode node = new TreeNode(arr[mid]);
		node.setLeft(convertsortedarraytobalbst(arr,start,mid-1));
		node.setRight(convertsortedarraytobalbst(arr,mid+1,end));
		
		return node;
	}
	
	public static void inOrder(TreeNode node) { 
        if (node == null) { 
            return; 
        } 
        inOrder(node.getLeft()); 
        System.out.print(node.getData() + " "); 
        inOrder(node.getRight()); 
    } 
}
