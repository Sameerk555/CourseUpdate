package MultiThreading;

public class DestroyTest {
	
	public static void main(String [] args) throws InterruptedException {
		
        ThreadGroup tg= new ThreadGroup("Parent Thread");
		ThreadGroup tg1= new ThreadGroup(tg, "child group");
//		
		Destroy dg1= new Destroy("first", tg);
		System.out.println("dg1 started");
		Destroy dg2= new Destroy("second", tg);
		System.out.println("dg2 Started");
//		
//		
//		dg1.join();
//		
//		dg2.join();
//		
//		tg1.destroy();
//		
//		System.out.println(tg1.getName()+ "is destroyed");
//		
//		System.out.println(tg1.isDestroyed());
//		
//		tg.destroy();
//		System.out.println(tg.getName()+ " is Destroyed");
		
		Thread[]grp= new Thread[tg.activeCount()];
		
		int cnt= tg.enumerate(grp);
		
		for(int i=0; i<cnt; i++) {
			System.out.println("Thread "+grp[i].getName()+" is found");
		}
//		tg.setMaxPriority(34);
		int priority= tg.getMaxPriority();
		
		System.out.println(priority+ " is maximum priority");
		
		System.out.println(tg1.getParent().getName()+ " parent of tg1");
		
		
		tg1.setDaemon(true);
		System.out.println(tg1.isDaemon());
		
	}

}
