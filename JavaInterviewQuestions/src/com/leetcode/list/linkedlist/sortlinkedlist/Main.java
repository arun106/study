package com.leetcode.list.linkedlist.sortlinkedlist;

import java.util.SortedSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(4);
		head.next = new ListNode(2);
		head.next.next = new ListNode(1);
		head.next.next.next = new ListNode(3);
		
		ListNode node = sortList(head);
		while (node != null) {
			System.out.print(node.val + " -> ");
			node = node.next;
		}
	}
	
	public static ListNode sortList(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode slow = head, fast = head, prev = null;
		
		while (fast != null && fast.next != null) {
			prev = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		prev.next = null;
		
		ListNode node1 = sortList(head);
		ListNode node2 = sortList(slow);
		
		ListNode node = mergeNodes (node1, node2);
		return node;
    }
	public static ListNode mergeNodes (ListNode l1, ListNode l2) {
		ListNode mhead = new ListNode(0), temp = mhead;
		
		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				mhead.next = l1;
				l1 = l1.next;
			}
			else {
				mhead.next = l2;
				l2 = l2.next;
			}
			mhead = mhead.next;
		}
		if (l1 != null) {
			mhead.next = l1;
		}
		if (l2 != null) {
			mhead.next = l2;
		}
		return temp.next;
	}

}

