package StringManipulation;

public class StringBuilderFuntion {
	
	public static void main(String [] args) {
		StringBuilder st= new StringBuilder("Sagar Kumar");
		StringBuilder st2= new StringBuilder("Rajiv");
		System.out.println(st.compareTo(st2));
		
		st.ensureCapacity(50);
		
		System.out.println(st);
	}

}
