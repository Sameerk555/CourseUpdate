package projectJava;
class C{
	public int sum(int a, int b){
		return (a+b);
	}
}
class B extends A{
	public int sum(int a, int b) {
		return (a+b);
	}
}
public class Override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b= new B();
		int k=b.sum(6, 5);
		System.out.println(k);
		C c= new C();
		int t=c.sum(6, 10);
		System.out.println(t);
	}

}
