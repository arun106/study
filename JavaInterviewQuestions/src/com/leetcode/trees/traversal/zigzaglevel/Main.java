package com.leetcode.trees.traversal.zigzaglevel;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.insert(20);
		tree.insert(25);
		tree.insert(5);
		tree.insert(15);
		tree.insert(27);
		tree.insert(17);
		tree.insert(19);
		tree.insert(21);
		tree.insert(7);
		List<List<Integer>> list = zigzagLevelOrder(tree.getRoot());
		System.out.println(list);
	}
	
	public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        int height = height(root);
        boolean flag = false;
        List<List<Integer>> finalList = new ArrayList<List<Integer>>();
        for (int i=1; i<=height; i++) {
        	List<Integer> list = new ArrayList<>();
        	printLevel(root, i, flag, list);
        	finalList.add(list);
        	flag = !flag;
        }
		return finalList;
    }
	
	public static void printLevel(TreeNode node, int level, boolean flag, List<Integer> list) {
		if (node == null) {
			return;
		}
		if(level == 1)
		{
			System.out.print(node.getData() + ", ");
			list.add(node.getData());
		}
		else if (level > 1) {
			if(flag) {
				printLevel(node.getLeft(), level-1, flag,list);
				printLevel(node.getRight(), level-1, flag, list);
			}
			else {
				printLevel(node.getRight(), level-1, flag, list);
				printLevel(node.getLeft(), level-1, flag, list);
			}
		}
	}
	
	public static int height(TreeNode node) {
		if(node == null) {
	    	return 0;
	    }
	    int ldepth = 1, rdepth = 1;
	    if(node.getLeft() != null) {
	    	ldepth = 1 + height(node.getLeft());
	    }
	    if(node.getRight() != null) {
	    	rdepth = 1 + height(node.getRight());
	    }
	    return Math.max(ldepth, rdepth);
	}
}
