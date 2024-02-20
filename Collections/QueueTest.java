package Collections;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		Queue<Integer>q= new PriorityQueue<>();
		
		q.offer(22);
		q.offer(11);
		q.offer(55);
		q.offer(6);
		q.offer(33);
		q.offer(3);
		q.offer(44);
		
//		System.out.println(q.peek());
//		System.out.println(q.poll());
//		System.out.println(q.peek());
		
//		Iterator<Integer>itr= q.iterator();
		
//		while(itr.hasNext()) {
//			
//			System.out.println(itr.next());
//		}
		
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}

	}

}
