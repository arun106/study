package com.leetcode.list.linkedlist.oddevenlinkedlist;

public class Main {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(3);
		l1.next.next.next = new ListNode(4);
		l1.next.next.next.next = new ListNode(5);
		ListNode head = l1;
		
		while (l1 != null) {
			System.out.print(l1.val + "->");
			l1 = l1.next;
		}
		System.out.println();
		ListNode l2 = oddEvenList(head);
		while (l2 != null) {
			System.out.print(l2.val + "->");
			l2 = l2.next;
		}
	}
	
	public static ListNode oddEvenList(ListNode head) {
		if(head == null)
			return null;
		ListNode l1 = head, l2 = head.next, head2 = l2, tail = null;
        while(l1 != null && l2!=null) {
        	l1.next = l2.next;
        	if(l1.next != null)
        		l2.next = l1.next.next;
        	if (l1.next == null)
        		tail = l1;
        	else
        		tail = l1.next;
        	l1=l1.next;
        	l2=l2.next;
        }
        if (tail != null)
        	tail.next = head2;
		return head;
    }

}
