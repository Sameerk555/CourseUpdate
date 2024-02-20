package ThreadGroup;

public class ActiveCount extends Thread {
	
	public ActiveCount(String tName, ThreadGroup tg) {
		super(tg, tName);
		start();
	}
	
	public void run() {
		for(int i=0; i<1000; i++) {
			try {
				Thread.sleep(5);
			}catch(InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}

}
