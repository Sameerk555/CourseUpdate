package ExceptionHandle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingFuntion {
	
	public static void main(String []args) throws Exception {
		Scanner sc= new Scanner(System.in);
		
		System.out.println(Thread.currentThread().getName());
		try {
			System.out.println("program started");
			int a= sc.nextInt();
			int b= sc.nextInt();
			int []arr= new int [5];
			int d= sc.nextInt();
			arr[d]=6;
			int c=a/b;
			System.out.println(c);
			System.exit(0);
		}
		catch(ArithmeticException e) {
//			System.out.println(e);
			e.printStackTrace();
		}
		catch(InputMismatchException e) {
			System.out.println("input mismatch");
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {
			System.out.println("program ended");
		}
		
		System.out.println("rest code");
		
//		ExceptionThow l= new ExceptionThow();
		
//		l.votingAge(5);
	}

}
