package com.Infy;

public class BinaryTreeLevelOrder {

	// Root of Binary Tree
    Node root;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeLevelOrder tree = new BinaryTreeLevelOrder();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        
        System.out.println("Level order traversal of binary tree is ");
        tree.levelorder(tree.root,3);
        
        //tree.findheight(tree.root);
	}
	
	public void levelorder(Node root,int level)
	{
		if(root == null)
			return;
		if (level == 1)
			System.out.print(root.data + " ");
		else if (level > 1)
		{
			levelorder(root.left,level-1);
			levelorder(root.right,level-1);
		}
	}

}

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