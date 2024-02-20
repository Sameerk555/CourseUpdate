package Encapsulation;

public class EmployeeTest {
	
	public static void main(String [] args) {
		
//		
//		Employee e= new Employee();
//		
//		e.setId(1);
//		e.setName("rajiv");
//		e.setDepartment("IT");
//		e.setSalary(40000);
//		
//		String k=e.getDepartment();
//		
//		System.out.println(k);
		
		Employee e= new Employee(1, "rajiv", "IT", 40000);
		
		System.out.println(e.toString());
		
		String k=e.getDepartment();
		System.out.println(k);
	}

}
