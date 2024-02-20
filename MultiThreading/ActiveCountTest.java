package MultiThreading;

import ThreadGroup.ActiveCount;

public class ActiveCountTest {

	public static void main(String[] args) {
//		ThreadGroup tg= new ThreadGroup("parent group");
//		ActiveCount th1= new ActiveCount("first", tg);
//		
//		System.out.println("starting first");
//		
//		ActiveCount th2= new ActiveCount("two", tg);
//		
//		System.out.println("Starting two");
//		
//       ActiveCount th3= new ActiveCount("two", tg);
//		
//		System.out.println("Starting three");
//		
//		
//		System.out.println("the total number of active threads are "+ tg.activeCount());
		
		
		ThreadGroup tg= new ThreadGroup("Parent Thread");
		
		ThreadGroup tg1= new ThreadGroup(tg, "child group");
		
		ThreadGroup tg2= new ThreadGroup(tg1, "child group");
		
		
		ActiveGroupCount th1= new ActiveGroupCount("first", tg);
		System.out.println("starting the first thread");
		
		ActiveGroupCount th2= new ActiveGroupCount("second", tg);
		
		System.out.println("starting the second thread");
		
		System.out.println("the total number of active group thread are "+tg1.activeGroupCount());

	}

}
