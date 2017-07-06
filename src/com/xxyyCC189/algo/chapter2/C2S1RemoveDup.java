package com.xxyyCC189.algo.chapter2;

import java.util.HashSet;

public class C2S1RemoveDup {
	public void removeDup(Node head) {
		HashSet<Integer> set = new HashSet<>();
		Node pre = null;
		Node node = head;
		
		while (node != null) {
			if (set.contains(node.data)) {
				pre.next = node.next;
			} else {
				set.add(node.data);
				pre = node;
			}
			node = node.next;
		}
	}
	
	public static void main(String[] args) {
		Node a = new Node(1);
		Node b = new Node(2);
		Node c = new Node(2);
		Node d = new Node(3);
		
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = null;
		
		C2S1RemoveDup test = new C2S1RemoveDup();
		Node node = a;
		test.removeDup(node);
		while(node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}

}
