package com.test;

public class BTreeMaxPathSum {

	Node root;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BTreeMaxPathSum tree = new BTreeMaxPathSum();
        tree.root = new Node(10);
        tree.root.left = new Node(2);
        tree.root.right = new Node(10);
        tree.root.left.left = new Node(20);
        tree.root.left.right = new Node(1);
        tree.root.right.right = new Node(-25);
        tree.root.right.right.left = new Node(3);
        tree.root.right.right.right = new Node(4);
        System.out.println("maximum path sum is : " +
                            tree.findMaxSum());
	
	}
	
	public int findMaxSum()
	{
		int rightSum = findSum(root.right);
		int leftSum =  findSum(root.left);
		int total = leftSum + rightSum + root.data;
		int lefttotal = leftSum + root.data;
		int righttotal = rightSum + root.data;

		return Math.max(righttotal,Math.max(lefttotal,Math.max(total,Math.max(leftSum,rightSum))));
	}

	public int findSum(Node root)
	{
		if(root == null) return 0;
		
		if(root.left == null && root.right == null)
		{
			return root.data;
		}
		else if(root.left!=null)
		{
			return Math.max(root.data, root.data+findSum(root.left));
		}
		else if(root.right!=null)
		{
			return Math.max(root.data, root.data+findSum(root.right));
		}
		return 0;
	}
}
