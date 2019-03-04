package com.leetcode.trees.nextrightnode;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		TreeLinkNode root = new TreeLinkNode(1);
		root.left = new TreeLinkNode(2);
		root.right = new TreeLinkNode(3);
		root.left.left = new TreeLinkNode(4);
		root.left.right = new TreeLinkNode(5);
		root.right.left = new TreeLinkNode(6);
		root.right.right = new TreeLinkNode(7);
		System.out.println(findheight(root));
		inorder(root);
		connect(root);
	}
	public static void connect(TreeLinkNode root) {
        int height = findheight(root);
        Map<Integer, TreeLinkNode> map = new HashMap();
        inorder (root, map, height);
    }
	public static void inorder(TreeLinkNode node, Map<Integer, TreeLinkNode> map, int level) {
		if (node == null)
			return;
		inorder(node.left, map, level-1);
		if(map.containsKey(level)) {
			map.get(level).next = node;
			System.out.println("Connected "+map.get(level).val+" -> "+node.val);
			map.put(level, node);
		}
		else {
			map.put(level, node);
		}
		inorder(node.right, map, level-1);
		return;
	}
	
	public static int findheight(TreeLinkNode root) {
        if (root == null) {
        	return 0;
        }
        int lheight = findheight(root.left)+1;
        int rheight = findheight(root.right)+1;
        return (Math.max(lheight, rheight));
    }
	
	public static void inorder(TreeLinkNode node) {
		if (node == null) 
			return;
		inorder(node.left);
		System.out.print(node.val+" ");
		inorder(node.right);
	}

}
