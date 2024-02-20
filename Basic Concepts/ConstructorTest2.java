package projectJava;

public class ConstructorTest2 {

  public ConstructorTest2() {
		super();
		// TODO Auto-generated constructor stub
	}



private int a;
  private int b;
  private int c;
  private int d;
  
  ConstructorTest2(int a, int b){
	  this.a=a;
	  this.b=b;  
  }
  ConstructorTest2(int a, int b, int c){
	  this.a=a;
	  this.b=b;  
	  this.c=c;
  }
  ConstructorTest2(int a, int b, int c, int d){
	  this.a=a;
	  this.b=b;  
	  this.c=c;
	  this.d=d;
  }
  
  public int sum(int a,int b) {
	  return a+b;
  }
  
  
  
  public int sum(int a,int b, int c) {
      return a+b+c;
//	  System.out.println(a+b+c);
  }
	
	

}
