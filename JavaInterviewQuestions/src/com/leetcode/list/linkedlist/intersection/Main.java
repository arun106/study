package com.leetcode.list.linkedlist.intersection;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
		ListNode temp1 = headA, temp2 = headB;
		int count1 = 0, count2 = 0, count = 0;
		if (headA == null || headB == null)
			return null;
		while(temp1 != null) {
			temp1 = temp1.next;
			count1++;
		}
		while(temp2 != null) {
			temp2 = temp2.next;
			count2++;
		}
		temp1 = headA; 
		temp2 = headB;
		if(count1 > count2) {
			count = count1-count2;
			while (count > 0) {
				count--;
				temp1 = temp1.next;
			}
		}
		else {
			count = count2-count1;
			while (count > 0) {
				count--;
				temp2 = temp2.next;
			}
		}
        while (temp1!=null && temp2!=null) {
        	if(temp1 == temp2) {
        		return temp1;
        	}
        	temp1 = temp1.next;
        	temp2 = temp2.next;
        }
		return null;
    }

}
