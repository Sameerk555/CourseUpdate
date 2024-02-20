package ShutDown;

public class ShutDownHookTest {

	public static void main(String[] args) {
		Runtime r= Runtime.getRuntime();
		
		r.addShutdownHook(new MyThread());
		
		System.out.println("now main is sleeping .. ctrl+c to exit");
		
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}

	}

}
