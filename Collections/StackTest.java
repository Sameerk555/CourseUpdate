package Collections;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		
		Stack<String>s= new Stack<>();
		s.push("akash");
		s.push("gaurav");
		s.push("rajiv");
		s.push("deepak");
		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}

	}

}
