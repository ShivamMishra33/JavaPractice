package com.dynamicstack;

public class DStack {
	
	int capacity=2;
	int stack[] =  new int[capacity];
	int top = 0;
	public void push(int data) {
		if(size()==capacity) {
			expand();
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
	
	public void expand() {
		int length = size();
		int newStack[] = new int[capacity*2];
		System.arraycopy(stack, 0, newStack, 0, length);
		stack = newStack;
		capacity*=2;
	}
	
	public int pop() {
		int data=0;
		if(isEmpty()) {
			System.out.println("Stack is empty");
		}else 
		{
		top--;
		data = stack[top];
		stack[top]=0;
		shrink();
		}
		return data;
	}
	public void shrink() {
		int length  = size();
		if(length<=(capacity/2)/2)
			capacity/=2;
		int newStack[] = new int[capacity];
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

