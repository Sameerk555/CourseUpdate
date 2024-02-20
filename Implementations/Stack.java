package Implementations;

import java.util.EmptyStackException;

public class Stack {
	
	private int maxSize;
	private int []stackArray;
	private int top;
	public Stack(int size) {
		this.maxSize=size;
		this.stackArray= new int[maxSize];
		this.top=-1;
	}
	public void push(int element) {
		if(isFull()) {
			System.out.println("stack is full. cannot push element "+element);
			return;
		}
		stackArray[++top]=element;
	}
	public int pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return stackArray[top--];
	}
	
	public int peek() {
		if(isEmpty()) {
			throw new EmptyStackException();	
		}
		return stackArray[top];
	}
	
	public boolean isEmpty() {
		return (top==-1);
	}
	public boolean isFull() {
		return (top==maxSize-1);
	}
	public void display(Stack st) {
		while(!st.isEmpty()) {
			System.out.print(st.pop()+" ");
		}
		System.out.println();
	}
	
	public static void main(String []args) {
		Stack st= new Stack(6);
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		st.push(6);
		
		System.out.println(st.peek());
		System.out.println(st.pop());
		
		
	}

}
