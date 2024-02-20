package InnerClass;

public class StaticInner {
	
	private static int a=25;
	
	static class Inner{
		
		void msg() {
			System.out.println("this is simple number "+a);
		}
	}
	
	public static void main (String [] args) {
		
		StaticInner.Inner obj= new StaticInner.Inner();
		
		obj.msg();
	}
	
}

