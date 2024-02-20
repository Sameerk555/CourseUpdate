package InterThread;

public class Test {

	public static void main(String[] args) {
		final Customer c= new Customer();
		
		new Thread() {
			public void run() {
				c.withdraw(1500);
			}
		}.start();
		
		new Thread() {
			public void run() {
				c.deposit(2000);
			}
		}.start();
		
		

	}

}
