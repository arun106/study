package com.leetcode.trees.BTmaxdepth;

public class Tree {
	private TreeNode root;
	
	/**
	 * @return the root
	 */
	public TreeNode getRoot() {
		return root;
	}
	/**
	 * @param root the root to set
	 */
	public void setRoot(TreeNode root) {
		this.root = root;
	}
	public void insert (int value) {
		if (root == null) {
			root = new TreeNode(value);
		}
		else {
			root.insert(value);
		}
	}
	public void inorder() {
		inorder (root);
	}
	private void inorder(TreeNode node) {
		if (node == null)
			return;
		inorder(node.getLeft());
		System.out.print(node.getData() + ", ");
		inorder(node.getRight());
	}
	
	public void delete (int value) {
		//root = delete(root, value);
	}
	/*private TreeNode delete (TreeNode subTreeRoot, int value) {
		if (subTreeRoot == null)
			return subTreeRoot;
		if (value < subTreeRoot.getData()) {
			subTreeRoot.setLeft(delete(subTreeRoot.getLeft(),value));
		}
		else if (value > subTreeRoot.getData()) {
			subTreeRoot.setRight(delete(subTreeRoot.getRight(),value));
		}
		else {
			if (subTreeRoot.getLeft() == null) {
				return subTreeRoot.getRight();
			}
			else if (subTreeRoot.getRight() == null)
				return subTreeRoot.getLeft();
		}
	}*/
	
	
}
