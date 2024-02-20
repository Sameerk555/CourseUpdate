package InnerClass;

public class LocalInnerClass {
	private int num=24;
	
	void display() {
		class Local{
			void msg() {
				System.out.println("this is simple message "+num);
			}
			
		}	
		Local l= new Local();
		l.msg();
	}
	
	void printTable(int a) {
		for(int i=1; i<5; i++) {
			int k=i*a;
			class Local{
				int c=k;
				void print(int b) {
					b=c;
					System.out.println(b);
				}
			}
			
			Local l=new Local();
			l.print(a);
		}
	}
	
	
	
	public static void main(String[] args) {
		
		LocalInnerClass l= new LocalInnerClass();
		l.printTable(6);
	}

}
