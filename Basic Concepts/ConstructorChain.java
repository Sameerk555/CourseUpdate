package projectJava;

public class ConstructorChain extends ConstructorSuperChain {
  private int a;
  private int b;
	public ConstructorChain() {
//		this("kumar", "rajesh");
		super("Sameer", "khan");
		System.out.println("default");
		// TODO Auto-generated constructor stub
	}
	
	public ConstructorChain(String str, int a) {
		System.out.println("paramaterized  " +str+a);
	}
	
	public ConstructorChain(int a, int b) {
		this.a=a;
		this.b=b;
		System.out.println(a+b);
	}
	public ConstructorChain(String a, String b) {
		this("kuch bhi", 7);
		System.out.println(a+b);
	}
	
	

}
