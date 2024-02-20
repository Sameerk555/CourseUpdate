package ShutDown;

public class ShutDown2 {

	public static void main(String[] args) {
		Runtime r= Runtime.getRuntime();
		r.addShutdownHook(new Thread() {
			public void run() {
				System.out.println("shut down hook completed");
			}
		});
		System.out.println("some message");
		try {
			Thread.sleep(3000);
		}catch(InterruptedException ex) {
			ex.printStackTrace();
		}

	}

}
