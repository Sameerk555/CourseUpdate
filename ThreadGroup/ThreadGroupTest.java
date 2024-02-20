package ThreadGroup;

public class ThreadGroupTest implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadGroupTest th= new ThreadGroupTest();
		ThreadGroup tg= new ThreadGroup("parent Thread Group");
		
		Thread t1= new Thread(tg,th,"one");
		
		t1.start();
		Thread t2= new Thread(tg, th, "two");
		t2.start();
		
		Thread t3= new Thread(tg, th, "three");
		t3.start();
		
		System.out.println("Thread Group name: " +tg.getName());
		
		tg.list();
				

	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		
	}

}
