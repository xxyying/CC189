package com.xxyyCC189.algo.chapter2;

import java.util.Stack;

public class C2S6Palindrome {
	public boolean isPalindrome(Node head) {
		if(head == null || head.next == null) {
			return true;
		}
		
		Node fast = head;
		Node slow = head;
		Stack<Integer> stack = new Stack<>();
		while (fast != null && fast.next != null) {
			stack.push(slow.data);
			slow = slow.next;
			fast = fast.next.next;
		}
		
		// if there are odd nodes
		if(fast != null) {
			slow = slow.next;
		}
		
		while(slow != null) {
			int top = stack.pop();
			if (top != slow.data) {
				return false;
			}
			slow = slow.next;
		}
		return true;
		
	}
	public static void main(String[] args) {
		Node a = new Node(3);
		Node b = new Node(5);
		Node c = new Node(8);
		Node d = new Node(2);
		Node e = new Node(8);
		Node f = new Node(5);
		Node g = new Node(3);
		
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;
		f.next = g;
		g.next = null;
		
		C2S6Palindrome test = new C2S6Palindrome();
		boolean result = test.isPalindrome(a);
		System.out.println(result);
	}

}
