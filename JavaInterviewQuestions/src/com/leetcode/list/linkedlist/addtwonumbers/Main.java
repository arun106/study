package com.leetcode.list.linkedlist.addtwonumbers;

public class Main {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		//l1.next = new ListNode(8);
		/*l1.next.next = new ListNode(5);
		l1.next.next.next = new ListNode(5);*/


		ListNode l2 = new ListNode(9);
		l2.next = new ListNode(9);
		//l2.next.next = new ListNode(9);

		ListNode l3 = addTwoNumbers(l1, l2);

		while (l3 != null) {
			System.out.print(l3.val + "->");
			l3 = l3.next;
		}

	}
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode l3 = null, root = null;
		int sum = 0, carry = 0;

		while(l1 != null && l2 != null) {
			sum = (l1.val + l2.val + carry) % 10;
			carry = (l1.val + l2.val + carry) / 10;

			if(l3 == null) {
				l3 = new ListNode(sum);
				root = l3;
			} 
			else {
				l3.next = new ListNode(sum);
				l3 = l3.next;
			}
			l1 = l1.next;
			l2 = l2.next;
		}
		while (l1 != null) {
			sum = (l1.val + carry) % 10;
			carry = (l1.val + carry) / 10;
			if(l3 == null) {
				l3 = new ListNode(sum);
				root = l3;
			} 
			else {
				l3.next = new ListNode(sum);
				l3 = l3.next;
			}
			l1 = l1.next;
		}
		while (l2 != null) {
			sum = (l2.val + carry) % 10;
			carry = (l2.val + carry) / 10;
			if(l3 == null) {
				l3 = new ListNode(sum);
				root = l3;
			} 
			else {
				l3.next = new ListNode(sum);
				l3 = l3.next;
			}
			l2 = l2.next;
		}
		if (carry > 0) {
			l3.next = new ListNode(1);     	
		}
		return root;
	}

}
