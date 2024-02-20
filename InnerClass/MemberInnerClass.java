package InnerClass;

public class MemberInnerClass {
	private int age=24;
	class Inner{
		void msg() {
			System.out.println("hello how are you, my age is "+age);
		}
		
		
	}

	public static void main(String[] args) {
		MemberInnerClass mb= new MemberInnerClass();
		
		MemberInnerClass.Inner in= mb.new Inner();
		
		in.msg();
		
	}

}
