package Collections;

import java.util.ArrayDeque;

public class ArrayDequeTest {
	
	public static void main(String [] args) {
//		ArrayDeQue<Integer>q= new ArrayDeque<>();
		ArrayDeque<Integer>q= new ArrayDeque<>();
		
		q.offer(22);
		q.offer(11);
		q.offer(35);
		q.offer(23);
		q.offer(23);
		q.offerFirst(45);
		q.offerFirst(100);
		q.offerLast(67);
		
		q.pollFirst();
		q.pollLast();
//		q.removeFirstOccurrence(23);
		System.out.println(q.peekFirst());
		System.out.println(q.peekLast());
		for(int a: q) {
			System.out.println(a);
		}
	
	}

}
