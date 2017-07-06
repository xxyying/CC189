package com.xxyyCC189.algo.chapter2;

public class DeleteNode {
	public Node deleteNode(Node head, int val) {
		Node n = head;
		
		if(n.data == val) {
			return head.next;
		}
		
		while(n.next != null) {
			if (n.next.data == val) {
				n.next = n.next.next;
				return head;
			}
			n = n.next;
		}
		return head;
	}
	public static void main(String[] args) {
		Node a = new Node(1);
		Node b = new Node(2);
		Node c = new Node(3);
		a.next = b;
		b.next = c;
		c.next = null;
		
		DeleteNode test = new DeleteNode();
		Node head = a;
		test.deleteNode(head, 2);
				
		Node n = head;
		while(n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}

}
