package com.leetcode.trees.validateBST;

public class TreeNode {
	private int data;
	private TreeNode left;
	private TreeNode right;
	
	public void insert (int value)
	{
		if (value == data) {
			return;
		}
		if (value < data) {
			if (left == null) {
				left = new TreeNode (value);
			}
			else {
				left.insert(value);
			}
		}
		if (value > data) {
			if (right == null) {
				right = new TreeNode (value);
			}
			else {
				right.insert(value);
			}
		}
	}
	
	/**
	 * @param data
	 */
	public TreeNode(int data) {
		super();
		this.data = data;
	}
	/**
	 * @return the data
	 */
	public int getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(int data) {
		this.data = data;
	}
	/**
	 * @return the left
	 */
	public TreeNode getLeft() {
		return left;
	}
	/**
	 * @param left the left to set
	 */
	public void setLeft(TreeNode left) {
		this.left = left;
	}
	/**
	 * @return the right
	 */
	public TreeNode getRight() {
		return right;
	}
	/**
	 * @param right the right to set
	 */
	public void setRight(TreeNode right) {
		this.right = right;
	}
	
}
