package com.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class BTreeLeftView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Create following Binary Tree
        1
      /  \
     2    3
      \
       4
        \
         5
          \
           6*/
		Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.left.right.right = new Node(5);
        root.left.right.right.right = new Node(6);
		
        //printLevelTree(root,2,0);
        
		HashMap<Integer,Integer> hmap = new HashMap();
        printLeftView(root,hmap,0);
        
        for(Integer key:hmap.keySet())
        	System.out.println(hmap.get(key));
	}
	
	static void printLeftView(Node root,HashMap hmap,int level)
	{
		System.out.println("level:"+level);
		if(root == null)
			return;
		
		if(!hmap.containsKey(level))
			hmap.put(level, root.data);
			
		if(root.left!=null)
			printLeftView(root.left,hmap,level+1);
		
		if(root.right!=null)
			printLeftView(root.right,hmap,level+1);
		
	}
	
	static void printLevelTree(Node root,int level,int i)
	{
		if(root == null)
			return;
		
		if(i+1 == level)
			System.out.println("Level "+level+":"+root.data);
		
		printLevelTree(root.left,level,i+1);
		printLevelTree(root.right,level,i+1);
		
		
	}

}
