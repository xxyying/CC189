package com.xxyyCC189.algo.chapter2;

public class C2S3DeleteMiddleNode {
	public void deleteNode(Node n) {
		Node next = n.next;
		n.data = next.data;
		n.next = next.next;
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
		
		C2S3DeleteMiddleNode test = new C2S3DeleteMiddleNode();
		Node n = e;
		test.deleteNode(n);
		Node start = a;
		while (start != null) {
			System.out.println(start.data);
			start = start.next;
		}
	}
}
