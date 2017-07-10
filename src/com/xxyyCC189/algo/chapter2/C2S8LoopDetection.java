package com.xxyyCC189.algo.chapter2;

public class C2S8LoopDetection {
	public Node loopDetection(Node head) {
		if (head == null || head.next == null) {
            return null;
        }
        
        Node slow = head;
        Node fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }
        
        if (fast == null || fast.next == null) {
            return null;
        }
        
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        
        return fast;
    }

	public static void main(String[] args) {
		Node a = new Node(3);
		Node b = new Node(5);
		Node c = new Node(8);
		Node d = new Node(2);
		Node e = new Node(6);
		Node f = new Node(7);
		Node g = new Node(9);
		
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;
		f.next = g;
		g.next = d;
		
		C2S8LoopDetection test = new C2S8LoopDetection();
		Node result = test.loopDetection(a);
		System.out.println(result.data);
	}

}
