package com.stack;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack =  new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.out.println("Before reversing");
		stack.display();
		ReverseStack.stackReverse(stack);
		System.out.println("AFter reversing:");
		stack.display();
		
	}

}
