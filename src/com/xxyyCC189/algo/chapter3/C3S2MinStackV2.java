package com.xxyyCC189.algo.chapter3;

import java.util.Stack;

class NodeWithMin {
	public int value;
	public int min;
	public NodeWithMin(int v, int min) {
		value = v;
		this.min = min;
	}
}

public class C3S2MinStackV2 extends Stack<NodeWithMin> {
	Stack<NodeWithMin> stack = new Stack<>();
	public void push(int value) {
		int curMin = Math.min(value, min());
		stack.push(new NodeWithMin(value, curMin));
	}
	
	public int min() {
		if (this.isEmpty()) {
			return Integer.MAX_VALUE;
		} else {
			return peek().min;
		}
	}
	
	public static void main(String[] args) {
		C3S2MinStackV2 test = new C3S2MinStackV2();
		test.push(-3);
		test.push(0);
		test.push(-2);
		int result = test.min();
		
		System.out.println(result);
	}

}
