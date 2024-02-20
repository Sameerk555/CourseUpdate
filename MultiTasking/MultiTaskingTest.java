package MultiTasking;

public class MultiTaskingTest {
	
	public static void main(String [] args) {
		
		
		Thread t1= new Thread() {
			public void run() {
				System.out.println("t1 running");
			}
		};
		Thread t2= new Thread() {
			public void run() {
				System.out.println("t2 running");
			}
		};
		t1.start();
		t2.start();
	}

}
