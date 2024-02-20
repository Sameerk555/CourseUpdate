package projectJava;

public class ConstructorTest3 extends ConstructorTest2 {

	public ConstructorTest3() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("child");
	}
	
	public int sum(int a, int b) {
		return a+b;
		
	}
	
	public int sum(int a, int b, int c) {
		return a+b+c;
		
	}
	
	public static int sum(int a, int b, int c, int d) {
		return a+b+c+d;
		
	}
	
	
	

}
