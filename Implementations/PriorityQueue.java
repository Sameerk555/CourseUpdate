package Implementations;

import java.util.ArrayList;
import java.util.List;

public class PriorityQueue<T extends Comparable<T>>{
	
	private List<T>heap;
	
	public PriorityQueue() {
		heap= new ArrayList<>();
	}
	public void add(T element) {
		heap.add(element);
		int index= heap.size()-1;
		heapifyUp(index);
	}
	public T remove() {
		if(isEmpty()) {
			throw new IllegalStateException("priority queue is empty");
		}
		T removedElement= heap.get(0);
		if(!isEmpty()) {
			heapifyDown(0);
		}
		return removedElement;
	}
	public boolean isEmpty() {
		return heap.isEmpty();
	}
	public void heapifyUp(int index) {
		int parentIndex= (index-1)/2;
		while(index>0 && heap.get(index).compareTo(heap.get(parentIndex))>0) {
			
//			swap(index, parentIndex);
			index=parentIndex;
			parentIndex=(index-1)/2;
			
		}
	}
	private void heapifyDown(int index) {
		int leftChildIndex=2*index+1;
//		int rightChildIndex=
	}
	public static void main(String[] args) {
		

	}

}
