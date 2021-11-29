package com.stack;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack =  new Stack();
		stack.push(10);
		stack.push(29);
		stack.push(45);
		System.out.println("Before popping");
		stack.display();
		System.out.println("After popping");
		stack.pop();
		stack.display();
	}

}
