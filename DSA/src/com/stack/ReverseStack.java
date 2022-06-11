package com.stack;

public class ReverseStack {
	public static void stackReverse(Stack stack) {
		if(stack.isEmpty()) return;
		int temp = stack.pop();
		stackReverse(stack);
		insertAtBottom(stack,temp);
	}

	private static void insertAtBottom(Stack stack, int data) {
		// TODO Auto-generated method stub
		if(stack.isEmpty()) {
			stack.push(data);
			return;
		}
		int temp = stack.pop();
		insertAtBottom(stack, data);
		stack.push(temp);
	}
	

}
