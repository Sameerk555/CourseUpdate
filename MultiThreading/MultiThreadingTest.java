package MultiThreading;

import java.util.Scanner;

public class MultiThreadingTest {
	
	public static void main(String []args) throws InterruptedException {
//		Thread.currentThread().setName("daemon");
//		System.out.println(Thread.currentThread().getName());
//		Thread.sleep(4000);
//		System.out.println(Thread.currentThread().getState());
//		System.out.println("started");
//		Scanner sc= new Scanner(System.in);
//		int a= sc.nextInt();
		
//		for(int i=0; i<a; i++) {
////			UsingThreadClass obj= new UsingThreadClass();
//			UsingThreadClass obj1= new UsingThreadClass();
//			UsingThreadClass obj2= new UsingThreadClass();
//			System.out.println(obj1.getState());
//			System.out.println(obj2.getState());
//			System.out.println(obj1.getPriority());
//			obj1.start();
//			obj2.start();
//			System.out.println(obj1.getState());
//			System.out.println(obj2.getState());
//			
//		}
//		UsingThreadClass obj1= new UsingThreadClass("obj1");
//		UsingThreadClass obj2= new UsingThreadClass("obj2");
//		obj2.setPriority(10);
//		System.out.println(obj1.getPriority());
//		obj1.start();
//		obj1.interrupt();
//		System.out.println(Thread.interrupted());
//		System.out.println(obj2.getPriority());
//		obj2.start();
//		System.out.println(obj1.isAlive());
//		obj1.setDaemon(true);
//		System.out.println(obj1.isDaemon());
		
		
		
//		for(int i=0; i<a; i++) {
//			UsingRunnableInterface us= new UsingRunnableInterface();
//			Thread obj= new Thread(us);
//			obj.start();
//		}
		
		JoiningThread t1= new JoiningThread();
		JoiningThread t2= new JoiningThread();
		JoiningThread t3= new JoiningThread();
		t1.start();
		try {
			System.out.println("current Thread :"+ Thread.currentThread().getName());
//			System.out.println(t1.getState());
			t1.join();
//			System.out.println(t1.getState());
		}catch(Exception e) {
			e.printStackTrace();
		}
		t2.start();
		try {
			System.out.println("current Thread :"+ Thread.currentThread().getName());
			t2.join();
		}catch(Exception e) {
			e.printStackTrace();
		}
		t3.start();
		try {
			System.out.println("current Thread :"+ Thread.currentThread().getName());
			t3.join();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
