package MultiThreading;

public class UsingThreadClass extends Thread{
	String s;
	public UsingThreadClass(String s) {
		this.s=s;
		System.out.println(s);
	}
	public void run() {
		
		try {
			Thread.sleep(1000);
			System.out.println("current thread " +Thread.currentThread().getId()+ "runnning " +s);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
