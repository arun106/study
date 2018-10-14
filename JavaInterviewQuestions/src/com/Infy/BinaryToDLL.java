package com.Infy;

class NodeB 
{
    int data;
    NodeB left, right;
 
    public NodeB(int data) 
    {
        this.data = data;
        left = right = null;
    }
}
 
class BinaryToDLL 
{
    // 'root' - root of binary tree
	NodeB root;
     
    // 'head' - reference to head node of created
    //double linked list
	NodeB head;
 
    // A simple recursive function to convert a given
    // Binary tree to Doubly Linked List
    void BToDLL(NodeB root) 
    {
        // Base cases
        if (root == null)
            return;
 
        // Recursively convert right subtree
        BToDLL(root.right);
 
        // insert root into DLL
        root.right = head;
 
        // Change left pointer of previous head
        if (head != null)
            (head).left = root;
 
        // Change head of Doubly linked list
        head = root;
 
        // Recursively convert left subtree
        BToDLL(root.left);
    }
 
    // Utility function for printing double linked list.
    void printList(NodeB head) 
    {
        System.out.println("Extracted Double Linked List is : ");
        while (head != null) 
        {
            System.out.print(head.data + " ");
            head = head.right;
        }
    }
 
    // Driver program to test the above functions
    public static void main(String[] args) 
    {
        /* Constructing below tree
               5
             /   \
            3     6
           / \     \
          1   4     8
         / \       / \
        0   2     7   9  */
         
    	BinaryToDLL tree = new BinaryToDLL();
        tree.root = new NodeB(5);
        tree.root.left = new NodeB(3);
        tree.root.right = new NodeB(6);
        tree.root.left.right = new NodeB(4);
        tree.root.left.left = new NodeB(1);
        tree.root.right.right = new NodeB(8);
        tree.root.left.left.right = new NodeB(2);
        tree.root.left.left.left = new NodeB(0);
        tree.root.right.right.left = new NodeB(7);
        tree.root.right.right.right = new NodeB(9);
 
        tree.BToDLL(tree.root);
        tree.printList(tree.head);
    }
}