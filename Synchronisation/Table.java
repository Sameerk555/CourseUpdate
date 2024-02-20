package Synchronisation;

public class Table {
	
	synchronized static void printTable(int n) {
		for(int i=1; i<=6; i++) {
			System.out.println(n*i);
		}
//		try {
//			Thread.sleep(400);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
	}

}
