package ExceptionHandle;

import java.util.Scanner;

public class ExceptionThow {
	
	public void votingAge(int age) throws ArithmeticException, Exception, NullPointerException {
		if(age<18) {
			throw new Exception("not eligible");
		}
		else {
			System.out.println("you are eligible");
		}
	}

}
