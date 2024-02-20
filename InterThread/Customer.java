package InterThread;

public class Customer {
	
	int amount= 1000;
	
	synchronized void withdraw(int amount) {
		System.out.println("going to withdraw.....");
		
		if(this.amount<amount) {
			System.out.println("less amount waiting for deposit...");
			try {
				wait();
			}catch(Exception ex) {
				ex.printStackTrace();
			}
		}
		this.amount-=amount;
		System.out.println("withdraw completed.......");
	}
	
	synchronized void deposit(int amount) {
		System.out.println("going to deposit");
		this.amount+=amount;
		
		System.out.println("deposit completed");
		notify();
	}

}
