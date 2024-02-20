package Synchronisation;

public class TestSynchronization2 {
	
	public static void main(String []args) {
		final Table obj= new Table();
		
		Thread t1= new Thread() {
			public void run() {
				obj.printTable(6);
			}
		};
		Thread t2= new Thread() {
			public void run() {
				obj.printTable(7);
			}
		};
		
		t1.start();
		t2.start();
	}

}
