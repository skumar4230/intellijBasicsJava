package com.infy;

import java.util.Stack;

public class Stacks {

	// type of list as one can say
	// LIFO -Last in first out
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("America");
		stack.push("INDIA");
		stack.push("Argentina");
		System.out.println("Stack: " + stack);

		// to remove one element
		String poppedElement = stack.pop();
		System.out.println("popped element: " + poppedElement);
		// return the top elements
		String peekElement1 = stack.peek();
		System.out.println("peek element: " + peekElement1);

		System.out.println("Now the stack looks like: " + stack);
	}
}
