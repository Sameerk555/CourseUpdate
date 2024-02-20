package NestedInterface;

public class TestNestedInterface implements NestedInterfaceClass.Message{

	@Override
	public void msg() {
	     System.out.println("Hello, how are you");
		
	}
	
	public static void main(String[]args) {
		
		NestedInterfaceClass.Message mg= new TestNestedInterface();
		mg.msg();
	}

}
