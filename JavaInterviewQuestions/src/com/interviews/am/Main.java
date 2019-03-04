package com.interviews.am;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(8);
		root.right = new TreeNode(12);
		root.left.left = new TreeNode(7);
		root.left.right = new TreeNode(9);
		root.right.left = new TreeNode(11);
		root.right.right = new TreeNode(14);
		inorder(root);
		System.out.println(levelOrderList(root));
	}
	public static void inorder (TreeNode node) {
		if (node == null)
			return;
		inorder(node.left);
		System.out.print(node.data + " ");
		inorder(node.right);
	}
	public static List<List<Integer>> levelOrderList(TreeNode root) {
		Queue<TreeNode> que = new LinkedList<>();
		List<List<Integer>> resultList = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		que.add(root);
		que.add(null);
		while(que.size()!=0) {
			TreeNode node = que.poll();
			if(node!=null) {
				//System.out.print(node.data+",");
				list.add(node.data);
				if(node.left != null)
					que.add(node.left);
				if(node.right != null)
					que.add(node.right);
			}
			else {
				resultList.add(list);
				if(que.size() == 0)
					break;
				list = new ArrayList<>();
				System.out.println();
				que.add(null);
			}
		}
		return resultList;
	}
}
