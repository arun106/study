package com.leetcode.trees.maxpathsum;

public class Solution {
	static int maxval;
	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(-5);
		System.out.println(maxPathSum(root));
	}
	public static int maxPathSum(TreeNode root) {
		maxval = Integer.MIN_VALUE;
		maxPathDown(root);
		return maxval;
	}
	public static int maxPathDown(TreeNode node) {
		if(node == null) return 0;
		int left = Math.max(0, maxPathDown(node.left));
		int right = Math.max(0, maxPathDown(node.right));
		maxval = Math.max(maxval, left+right+node.val);
		return Math.max(left, right)+node.val;
	}
}
