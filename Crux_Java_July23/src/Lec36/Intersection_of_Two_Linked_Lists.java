package Lec36;

public class Intersection_of_Two_Linked_Lists {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public class Solution {
		public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
			ListNode v = headA;
			ListNode vgf = headB;
			while (v != vgf) {
				if (v == null) {
					v = headB;
				} else {
					v = v.next;
				}
				if (vgf == null) {
					vgf = headA;
				} else {
					vgf = vgf.next;
				}
			}
			return v;

		}
	}
}