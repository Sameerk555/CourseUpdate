package Recursion;

public class RecursionTest {
	static void hello(int i) {
		i--;
		if(i==0) {
			System.out.println("hello");
			return;
		}
		System.out.println("hello");
		hello(i);
	}
	public static void main(String [] args) {
		
		hello(6);
	}

}
