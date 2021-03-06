package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Queue;
import java.util.TreeMap;
import java.util.LinkedList;
import java.util.Map;


public class BTreeBottomView {

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
        
        printVerticalView(root);
        
	}
	
	
	
	static void printVerticalView(Node root)
	{
		if(root == null) return;
		
		Queue<Qitem> queue = new LinkedList<Qitem>();
		
		Map <Integer,Integer> hmap = new TreeMap<Integer, Integer>();
		
		queue.add(new Qitem(root,0));
		
		while(!queue.isEmpty())
		{
			Qitem qitem=queue.poll();
			
			//Replace the item in top view each time to get bottom view
			/*if(!hmap.containsKey(qitem.hd)) 
			{*/
				//System.out.print(qitem.item.data+" ");
				hmap.put(qitem.hd,qitem.item.data);
			//}
			if(qitem.item.left != null)
				queue.add(new Qitem(qitem.item.left,qitem.hd-1));
			if(qitem.item.right != null)
				queue.add(new Qitem(qitem.item.right,qitem.hd+1));
			
		}
		
		for(Integer key:hmap.keySet())
			System.out.print(hmap.get(key)+" ");
		
	}

}

/*class Qitem
{
	Node item;
	int hd;
	public Qitem(Node item,int hd)
	{
		this.item = item;
		this.hd = hd;
	}
}*/