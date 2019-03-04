/**
 * 
 */
package com.test;

/**
 * @author Arun Mohan
 *
 */
public class DepthFirstSearch {

	Node root;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DepthFirstSearch tree = new DepthFirstSearch();
		tree.root= new Node(1);
		tree.root.left= new Node(2);
		tree.root.right= new Node(3);
		tree.root.left.left= new Node(4);
		tree.root.left.right= new Node(5);
		
		tree.depthfirstsearch(tree.root);
	}
	
	public void depthfirstsearch(Node node)
	{
		if(node == null)
			return;
		else
		{
			if(node.left != null)
				depthfirstsearch(node.left);
			if(node.right != null)
				depthfirstsearch(node.right);
			System.out.print(node.data+" ");
		}
	}
}
