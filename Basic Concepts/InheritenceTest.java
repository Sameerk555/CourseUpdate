package projectJava;

public class InheritenceTest {
	
	
	public static void main(String [] args) {
		
//		Bikes b= new Bikes();
//		
//		b.horn("bike");
//		b.indicator("left");
//		b.test();
//		
//		b.gear(2);
		
//		Vehicles v= new Bikes();
//		v.indicator("");
//		
//		v.test();
//		
//		Bikes b= (Bikes) new Vehicles();
//		
//		double a=0;
//		
//		int c= (int)(a);
		
//		AbstractConcept k= new AbstractConcept() {
//			
//			public int sum(int a, int b) {
//				// TODO Auto-generated method stub
//				return a+b;
//			}
//			
//			public void run() {
//				// TODO Auto-generated method stub
//				System.out.println("running");
//				
//			}
//			
//		};
//		k.testing();
//		k.sum(6, 6);
//		ChildAbstract c= new ChildAbstract();
//		
//		c.run();
//		int a=c.sum(4, 5);
//		System.out.println(a);
//		c.testing();
		
		
//		InterfaceTest t= new InterfaceChild();
//		
//		t.fun();
//		
//		int a=t.multiply(5, 6);
//		
//		int b= t.sum(5, 6);
//		
//		System.out.println(a+ " "+b);
		
		
		InterfaceTest t= new InterfaceTest() {
			

			public int sum(int a, int b) {
				// TODO Auto-generated method stub
				return a+b;
			}
			
			public int multiply(int a, int b) {
				// TODO Auto-generated method stub
				return a*b;
			}
			
			public void fun() {
				// TODO Auto-generated method stub
				System.out.println("fun");
			}
		};
		
		t.fun();
		int a= t.multiply(6, 6);
		
		int b= t.sum(6, 6);
		
		System.out.println(a+ " "+b);
		
		
		
	}

}
