package Implementations;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class StackArrayList {
	
	private ArrayList<Integer>l;
	public StackArrayList() {
		l= new ArrayList<>();
	}
	public void push(int element) {
		l.add(element);
	}
	public int pop() {
		if(l.size()==0) {
			throw new EmptyStackException();
		}
		int a= l.get(l.size()-1);
		l.remove(l.size()-1);
		return a;
	}
	public int peek() {
		
		if(l.size()==0) {
			throw new EmptyStackException();
		}
		return l.get(l.size()-1);
		
	}
	
	public static void main(String []args) {
		StackArrayList st= new StackArrayList();
		
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
