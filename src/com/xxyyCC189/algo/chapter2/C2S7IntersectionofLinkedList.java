package com.xxyyCC189.algo.chapter2;

class Result {
	public Node tail;
	public int size;
	
	public Result(Node tail, int size) {
		this.tail = tail;
		this.size = size;
	}
}


public class C2S7IntersectionofLinkedList {
	public Node findIntersection(Node headA, Node headB) {
		if (headA == null || headB == null) {
			return null;
		}
		
		Node startA = headA;
		Node startB = headB;
		
		while(startA != startB) {
			startA = startA == null ? headB : startA.next;
			startB = startB == null ? headA : startB.next;
		}
		
		return startA;		
	}
	
	public Node findIntersectionByLength(Node head1, Node head2) {
		if (head1 == null || head2 == null) return null;
		
		Result result1 = getTailandSize(head1);
		Result result2 = getTailandSize(head2);
		
		if(result1.tail != result2.tail) {
			return null;
		}
		
		Node shorter = result1.size < result2.size ? head1 : head2;
		Node longer = result1.size < result2.size ? head2 : head1;
		
		longer = getKthNode(longer, Math.abs(result1.size - result2.size));
	
		while (shorter != longer) {
			shorter = shorter.next;
			longer = longer.next;
		}
		return longer;
	}
	
	
	private Result getTailandSize(Node node) {
		if (node == null) {
			return null;
		}
		int size = 1;
		Node current = node;
		while(current.next != null) {
			size++;
			current = current.next;
		}
		return new Result(current, size);
	}
	
	private Node getKthNode(Node head, int k) {
		Node current = head;
		while(k > 0 && current != null) {
			current = current.next;
			k--;
		}
		return current;
	}
	
	
	public static void main(String[] args) {

		// 3 -> 5 -> 8 -> 2
		Node a = new Node(3);
		Node b = new Node(5);
		Node c = new Node(8);
		Node d = new Node(2);
		
		// 1 -> 8 -> 2
		Node i = new Node(1);
				
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = null;
		
		i.next = c;
		
		
		C2S7IntersectionofLinkedList test = new C2S7IntersectionofLinkedList();
		Node result = test.findIntersection(a, i);
		System.out.println(result.data);
		
		result = test.findIntersectionByLength(a, i);
		System.out.println(result.data);
		
	}

}
