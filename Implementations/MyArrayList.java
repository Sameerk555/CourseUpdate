package Implementations;

import java.util.Arrays;

public class MyArrayList<T> {
	
	private static final int DEFAULT_CAPACITY= 10;
	private Object[] element;
	private int size;
	
	public MyArrayList() {
		element= new Object[DEFAULT_CAPACITY];
	}
	
	public MyArrayList(int initialCapacity) {
		if(initialCapacity<0) {
			
			throw new IllegalArgumentException();
			
		}
		element= new Object[initialCapacity];
	}
	
	public void add(T t) {
		
		ensureCapacity(size+1);
		element[size++]=t;
		
	}
	
	public T get(int index) {
		if(index<0 || index>=size) {
			throw new IndexOutOfBoundsException();
		}
		return (T) element[index];
	}
	
	
	private void ensureCapacity(int minCapacity) {
		
		int oldCapacity= element.length;
		if(minCapacity>oldCapacity) {
			int newCapacity= oldCapacity+oldCapacity/2; //oldCapacity>>1
			if(newCapacity<minCapacity) {
				newCapacity= minCapacity;
			}
			element= Arrays.copyOf(element, newCapacity);
		}	
	}
	public int getSize() {
		return size;
	}
	public T remove (int index) {
		if(index<0 || index>=size) {
			throw new IndexOutOfBoundsException();
		}
		T removedElement= (T)element[index];
		int numMoved= size-index-1;
		
		if(numMoved>0) {
			System.arraycopy(element, index+1, element, index, numMoved);
		}
		element[--size]=null;
		return removedElement;
	}
	
	
	

}
