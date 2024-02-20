package MultiThreading;

public class JoiningThread extends Thread{
	
	public void run() {
		for(int i=0; i<3; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("Current thread : "+ Thread.currentThread().getName());
				
			}catch(InterruptedException ex) {
				ex.printStackTrace();
			}
			
			System.out.println(i);
		}
	}

}
