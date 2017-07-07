package com.xxyyCC189.algo.chapter2;

public class C2S2KthtoLast {
	
	// iterative
	public Node kthtoLastiter(Node head, int k) {
		if (head == null) {
			return null;
		}
		Node p1 = head;
		Node p2 = head;
		for(int i = 0; i < k; i++) {
			if (p1 == null) {
				return null;
			}
			p1 = p1.next;
		}
		while (p1 != null) {
			p1 = p1.next;
			p2 = p2.next;
		}
		return p2;
	}
	
	// recursion
	public int kthtoLastrecc(Node head, int k) {
		if (head == null) {
			return 0;
		}
		int idx = kthtoLastrecc(head.next, k) + 1;
		if (idx == k) {
			System.out.println("This is the value of " + k + "th to the last: " + head.data);
		}
		return idx;
	}
	
	public static void main(String[] args) {
		Node a = new Node(1);
		Node b = new Node(2);
		Node c = new Node(3);
		Node d = new Node(4);
		Node e = new Node(5);
		Node f = new Node(6);
		Node g = new Node(7);
		
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;
		f.next = g;
		g.next = null;
		C2S2KthtoLast test = new C2S2KthtoLast();
		Node head = a;
		int k = 6;
		int result = test.kthtoLastiter(head, k).data;
		System.out.println(result);
		
		result = test.kthtoLastrecc(head, k);
		System.out.println(result);
	}

}
