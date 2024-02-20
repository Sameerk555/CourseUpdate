package projectJava;
class A{
	public int sum(int a, int b) {
		return (a+b);
	}
	public String sum(String a, String b) {
		return (a+b);
	}
}
public class Overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a= new A();
		int b=5;
		int c=6;
		int k=a.sum(c, b);
		String d= "Sameer";
		String e= "Khan";
		String t=a.sum(d, e);
		System.out.println(k);
		System.out.println(t);
	}

}
