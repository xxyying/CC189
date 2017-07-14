package com.xxyyCC189.algo.chapter3;

import java.util.Stack;

public class C3S2MinStack {
	Stack<Integer> stack;
    Stack<Integer> minStack; 
    
    /** initialize your data structure here. */
    public C3S2MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int x) {
        if(x <= getMin()) {
            minStack.push(x);
        }
        stack.push(x);
    }
    
    public void pop() {
        int value = stack.pop();
        if(value == getMin()) {
            minStack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        if (minStack.isEmpty()) {
            return Integer.MAX_VALUE;
        } else {
            return minStack.peek();
        }
    }
    
    
    /*
     * 
     * ["MinStack","push","push","push","getMin","pop","top","getMin"]
     * [[],[-2],[0],[-3],[],[],[],[]]
     * 
     * 
     */
	public static void main(String[] args) {
		C3S2MinStack test = new C3S2MinStack();
		test.push(-2);
		test.push(0);
		test.push(-3);
		
		System.out.println(test.getMin());
		test.pop();
		System.out.println(test.top());
		System.out.println(test.getMin());


	}

}
