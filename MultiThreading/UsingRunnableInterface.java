package MultiThreading;

public class UsingRunnableInterface implements Runnable {

	@Override
	public void run() {
		try {
			System.out.println("current thread " +Thread.currentThread().getId()+ "runnning");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
