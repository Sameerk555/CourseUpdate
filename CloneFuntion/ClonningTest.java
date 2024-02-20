package CloneFuntion;

public class ClonningTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Student s1= new Student(1, "ram");
		
		Student s2= (Student) s1.clone();
		
		System.out.println(s2.getName());
		System.out.println(s2.getId());
		
		

	}

}
