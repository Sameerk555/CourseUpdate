package ShutDown;

public class RemoveShutDownHook {
	static class Msg extends Thread{
		public void run() {
			System.out.println("removing");
		}
	}
	public static void main(String []args) {
		try {
			Msg ms= new Msg();
			
			Runtime.getRuntime().addShutdownHook(ms);
			
			System.out.println("program started");
			Thread.sleep(3000);
			Runtime.getRuntime().removeShutdownHook(ms);
			
			System.out.println("program terminated");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
