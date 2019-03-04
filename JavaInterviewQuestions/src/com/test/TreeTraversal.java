package com.test;

public class TreeTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// Java program for different tree traversals
	 
	/* Class containing left and right child of current
	   node and key value*/
	/*class Node
	{
	    int key;
	    Node left, right;
	 
	    public Node(int item)
	    {
	        key = item;
	        left = right = null;
	    }
	}*/
	 
	class BinaryTree
	{
	    // Root of Binary Tree
	    Node root;
	 
	    BinaryTree()
	    {
	        root = null;
	    }
	 
	    /* Given a binary tree, print its nodes according to the
	      "bottom-up" postorder traversal. */
	    void printPostorder(Node node)
	    {
	        if (node == null)
	            return;
	 
	        // first recur on left subtree
	        printPostorder(node.left);
	 
	        // then recur on right subtree
	        printPostorder(node.right);
	 
	        // now deal with the node
	        System.out.print(node.data + " ");
	    }
	 
	    /* Given a binary tree, print its nodes in inorder*/
	    void printInorder(Node node)
	    {
	        if (node == null)
	            return;
	 
	        /* first recur on left child */
	        printInorder(node.left);
	 
	        /* then print the data of node */
	        System.out.print(node.data + " ");
	 
	        /* now recur on right child */
	        printInorder(node.right);
	    }
	 
	    /* Given a binary tree, print its nodes in preorder*/
	    void printPreorder(Node node)
	    {
	        if (node == null)
	            return;
	 
	        /* first print data of node */
	        System.out.print(node.data + " ");
	 
	        /* then recur on left sutree */
	        printPreorder(node.left);
	 
	        /* now recur on right subtree */
	        printPreorder(node.right);
	    }
	}
	
}
