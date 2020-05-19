package com.pack.datastruture;

import java.util.Stack;

public class MyStack {

	// pushing element on top of the stack
	static void stack_push(Stack<Integer> stack) {
		for (int i = 0; i < 5; i++) {
			stack.push(i);
		}
	}

	// popping element from top of stack
	static void stack_pop(Stack<Integer> stack) {
		System.out.println("Pop:");

		for (int i = 0; i < 5; i++) {
			Integer y = (Integer) stack.pop();
			System.out.println(y);
		}
	}

	// Displaying element on top of stack
	static void stack_peek(Stack<Integer> stack) {
		Integer peek = (Integer) stack.peek();
		System.out.println("Element on top of stack: " + peek);
	}

	// searching element in stack
	static void stack_search(Stack<Integer> stack, int element) {
		Integer pos = (Integer) stack.search(element);

		if (pos == -1)
			System.out.println("Element not found");
		else
			System.out.println("Element fount at pos: " + pos);
	}

	public static void main(String args[]) {
		Stack<Integer> stack = new Stack<Integer>();

		stack_push(stack);
		stack_pop(stack);
		stack_push(stack);
		stack_peek(stack);
		stack_search(stack, 2);
		stack_search(stack, 6);
	}
}
