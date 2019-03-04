package com.leetcode.arraysandstring.mergeksortedlist;

public class Main {

	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		n1.next = new ListNode(4);
		n1.next.next = new ListNode(5);
		ListNode n2 = new ListNode(1);
		n2.next = new ListNode(3);
		n2.next.next = new ListNode(4);
		ListNode n3 = new ListNode(2);
		n3.next = new ListNode(6);
		ListNode[] lists = {n1, n2, n3};
		ListNode node = mergeKLists(lists);
		while(node != null) {
			System.out.print(node.val+" ");
			node = node.next;
		}
	}
	public static ListNode mergeKLists(ListNode[] lists) {
		return mergeNodes(lists, 0, lists.length-1);
    }
	public static ListNode mergeNodes(ListNode[] lists, int start, int end) {
		if(start > end) {
			return null;
		}
		if (start == end) {
			return lists[start];
		}
		else {
			int mid = (start+end)/2;
			ListNode n1 = mergeNodes(lists, start, mid);
			ListNode n2 = mergeNodes(lists, mid+1, end);
			return mergeNodes(n1,n2);
		}
	}
	public static ListNode mergeNodes(ListNode n1, ListNode n2) {
		ListNode result = null;
		if(n1 == null)
			return n2;
		if(n2 == null)
			return n1;
		if(n1.val < n2.val) {
			result = n1;
			result.next  = mergeNodes(n1.next, n2);
		}
		else {
			result = n2;
			result.next = mergeNodes(n1, n2.next);
		}
		return result;
	}	
}