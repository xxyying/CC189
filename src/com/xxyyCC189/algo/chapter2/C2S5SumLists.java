package com.xxyyCC189.algo.chapter2;

public class C2S5SumLists {
	public Node addLists(Node l1, Node l2) {
		if (l1 == null && l2 == null) {
			return null;
		}
		Node prev = new Node(0);
		Node head = prev;
		int carry = 0;
		
		while (l1 != null || l2 != null || carry != 0) {
			Node cur = new Node(0);
			int sum = ((l2 == null) ? 0 : l2.data) + ((l1 == null) ? 0 : l1.data) + carry;
			cur.data = sum % 10;
			carry = sum / 10;
			prev.next = cur;
			prev = cur;
			
			l1 = (l1 == null) ? l1 : l1.next;
			l2 = (l2 == null) ? l2 : l2.next;
			
		}
		return head.next;
	}
	public static void main(String[] args) {
		Node a = new Node(2);
		Node b = new Node(4);
		Node c = new Node(3);
		
		Node d = new Node(5);
		Node e = new Node(6);
		Node f = new Node(4);
		
		a.next = b;
		b.next = c;
		c.next = null;
		
		d.next = e;
		e.next = f;
		f.next = null;
		
		C2S5SumLists test = new C2S5SumLists();
		Node result = test.addLists(a, d);
		while (result != null) {
			System.out.println(result.data);
			result = result.next;
		}
	}

}
