package com.test;

public class BreadthFirstSearch {

	Node root;
	
	public BreadthFirstSearch()
    {
        root = null;
    }
	
	void printLevelOrder()
    {
        int h = height(root);
        int i;
        for (i=1; i<=h; i++)
            printGivenLevel(root, i);
    }
	
	int height(Node root)
    {
        if (root == null)
           return 0;
        else
        {
            /* compute  height of each subtree */
            int lheight = height(root.left);
            int rheight = height(root.right);
             
            /* use the larger one */
            if (lheight > rheight)
                return(lheight+1);
            else return(rheight+1); 
        }
    }
	
	void printGivenLevel (Node root ,int level)
    {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");
        else if (level > 1)
        {
            printGivenLevel(root.left, level-1);
            printGivenLevel(root.right, level-1);
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BreadthFirstSearch tree = new BreadthFirstSearch();
		tree.root= new Node(1);
		tree.root.left= new Node(2);
		tree.root.right= new Node(3);
		tree.root.left.left= new Node(4);
		tree.root.left.right= new Node(5);

		System.out.println("Level order traversal of binary tree is ");
		tree.printLevelOrder();
	}
	
}
