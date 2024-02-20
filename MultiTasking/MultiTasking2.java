package MultiTasking;

public class MultiTasking2 {
	
	public static void main(String []args) {
		
		Runnable r1= new Runnable() {
			
			@Override
			public void run() {
				System.out.println("r1 is running");
				
			}
		};
		Runnable r2= new Runnable() {
			
			@Override
			public void run() {
				System.out.println("r2 is running");
				
			}
		};
		Thread t1= new Thread(r1);
		Thread t2= new Thread(r2);
		
		t1.start();
		t2.start();
	}

}
