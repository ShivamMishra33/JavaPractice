package com.stack;

public class Stack {
	
	int stack[] =  new int[5];
	int top = 0;
	public void push(int data) {
		if(top==5) {
			System.out.println("Stack is full");
		}
		else {
		stack[top] = data;
		top ++;
		}}
	public void display() {
		for (int i : stack) {
			System.out.println(i +" ");
		}
	}
	
	public int pop() {
		top--;
		int data = stack[top];
		stack[top]=0;
		return data;
	}
	public int peek() {
		return stack[top-1];
	}
	public int size() {
		return top;
	}
	public boolean isEmpty() {
		return top<=0;
	}
	public boolean isFull() {
		return top==stack.length;
	}
}
