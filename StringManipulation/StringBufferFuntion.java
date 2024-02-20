package StringManipulation;

public class StringBufferFuntion {
	
	public static void main(String [] args) {
		
		StringBuffer st= new StringBuffer("Deepak Sarwa");
		
		System.out.println(st.capacity());
		
		char c= st.charAt(4);
		
		System.out.println(c);
		
//		st.delete(4, 8);
//		st.deleteCharAt(4);
		System.out.println(st);
		
		System.out.println(st.indexOf("a", 5));
		
		st.insert(4, 'c');
		System.out.println(st);
		System.out.println(st.lastIndexOf("a"));
		
		st.replace(4, 8, "abcd");
		
		System.out.println(st);
		
//		StringBuffer s2= new StringBuffer("a");
		
//		System.out.println(s2.capacity());
		
		String s2= st.toString(); 
		
		System.out.println(s2);
		st.trimToSize();
		System.out.println(st.reverse());
		
		st.setCharAt(4, 'k');
		
		System.out.println(st);
		
		System.out.println(st.append("sameer"));
		
		st.insert(4,"kumar");
		System.out.println(st);
		
		
		
	}

}
