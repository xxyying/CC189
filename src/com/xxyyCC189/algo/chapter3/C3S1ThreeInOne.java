package com.xxyyCC189.algo.chapter3;

/*
 * 	In order to implement a stack (FILO):
 * 		push()
 * 		peek()
 * 		pop()
 * 		isEmpty()
 */


public class C3S1ThreeInOne {
	
	private int stackCapacity;
	private int numberOfStacks = 3;
	private int[] values;
	private int[] sizes;
	
	// constructor
	public C3S1ThreeInOne(int stackSize) {
		stackCapacity = stackSize;
		sizes = new int[numberOfStacks]; // record the current size of each stack
		values = new int[stackSize * numberOfStacks]; 
	}
	
	public void push(int numOfStack, int value) throws Exception{
		if (isFull(numOfStack)) {
			throw new Exception("Stack No." + numOfStack + "is FULL, cannot push data into it any more!");
		}
		sizes[numOfStack]++;
		values[indexOfTop(numOfStack)] = value;
	}

	public int pop (int numOfStack) {
		if (isEmpty(numOfStack)) {
			System.out.println("Stack No." + numOfStack + "is EMPTY, cannot pop data from it!");
		}
		int value = values[indexOfTop(numOfStack)];
		values[indexOfTop(numOfStack)] = 0;
		sizes[numOfStack]--;
		return value;
		
	}
	
	public int peek(int numOfStack) {
		if (isEmpty(numOfStack)) {
			System.out.println("Stack No." + numOfStack + "is EMPTY, cannot pop data from it!");
		}
		return values[indexOfTop(numOfStack)];
	}
	
	public boolean isEmpty(int numOfStack) {
		return sizes[numOfStack] == 0;
	}
	
	private boolean isFull(int numOfStack) {
		return sizes[numOfStack] == stackCapacity;
	}
	
	private int indexOfTop(int numOfStack) {
		int offset = numOfStack * stackCapacity;
		int size = sizes[numOfStack];
		return offset + size - 1;
	}
	
	
	public static void main(String[] args) throws Exception {
		C3S1ThreeInOne test = new C3S1ThreeInOne(10);
		
		test.push(1, 2);
		test.push(1, 3);
		System.out.println(test.pop(1));
		while(!test.isEmpty(1)) {
			System.out.println(test.pop(1));
		}
	}

}
