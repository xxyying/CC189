package com.xxyyCC189.algo.chapter2;

public class C2S4Partition {
	public Node partition(Node head, int target) {
		Node dummy1 = new Node(0);
		Node dummy2 = new Node(0);
		Node before = dummy1;
		Node after = dummy2;
		
		while (head != null) {
			if (head.data < target) {
				before.next = head;
				before = head;
			} else {
				after.next = head;
				after = head;
			}
			head = head.next;
		}
		after.next = null;
		before.next = dummy2.next;
		return dummy1.next;
	}
	
	public static void main(String[] args) {
		Node a = new Node(3);
		Node b = new Node(5);
		Node c = new Node(8);
		Node d = new Node(5);
		Node e = new Node(10);
		Node f = new Node(2);
		Node g = new Node(1);
		
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;
		f.next = g;
		g.next = null;
		
		C2S4Partition test = new C2S4Partition();
		int target = 5;
		Node node = a;
		test.partition(node, target);
		Node head = a;
		while (head != null) {
			System.out.println(head.data);
			head = head.next;
		}
	}

}
