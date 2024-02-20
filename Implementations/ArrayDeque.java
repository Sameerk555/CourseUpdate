package Implementations;

public class ArrayDeque<T> {
	
	private Object[] array;
	private int size;
	private int front;
	private int rear;
	
	public ArrayDeque(int capacity) {
		array= new Object[capacity];
		size=0;
		front=0;
		rear=-1;
	}
	public boolean isEmpty() {
		return size==0;
	}
	public boolean isFull() {
		return size==array.length;
	}
	public int size() {
		return size;
	}
	public void addFirst(T element) {
		if(isFull()) {
			throw new IllegalStateException("Deque is Full");
		}
		front= (front-1+array.length)%array.length;
		array[front]=element;
		size++;
	}
	public void addLast(T element) {
		if(isFull()) {
			throw new IllegalStateException("Deque is Full");
		}
		rear=(rear+1)%array.length;
		array[rear]=element;
		size++;
	}
	public T removeFirst() {
		if(isEmpty()) {
			throw new IllegalStateException("Deque is Empty");
		}
		T removedElement= (T)array[front];
		array[front]=null;
		front=(front+1)%array.length;
		size--;
		return removedElement;
	}
	public T removeLast() {
		if(isEmpty()) {
			throw new IllegalStateException("Deque is Empty");
		}
		T removedElement= (T)array[rear];
		array[rear]=null;
		rear=(rear-1+array.length)%array.length;
		size--;
		return removedElement;
	}
	public T peekFirst() {
		if(isEmpty()) {
			throw new IllegalStateException("Deque is Empty");
		}
		return (T)array[front];
	}
	public T peekLast() {
		if(isEmpty()) {
			throw new IllegalStateException("Deque is Empty");
		}
		return (T)array[rear];
	}
	
	public void display() {
		if(isEmpty()) {
			throw new IllegalStateException("Deque is Empty");
		}
		System.out.print("Deque :");
		
		int index= front;
		for(int i=0; i<size; i++) {
			System.out.print(array[index]+ " ");
			index=(index+1)%array.length;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		ArrayDeque<Integer>l= new ArrayDeque<>(10);
//		
		l.addLast(1);
		l.addLast(2);
		l.addLast(3);
		l.addLast(4);
		l.addLast(5);
		l.addFirst(6);
		l.display();
		System.out.println(l.removeFirst()+" removed element");
		System.out.println("after removing first element");
		l.display();
		
		System.out.println(l.peekFirst());
		System.out.println(l.peekLast());
		

	}

}
