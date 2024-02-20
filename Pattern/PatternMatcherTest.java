package Pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest {

	public static void main(String[] args) {
		Pattern p= Pattern.compile("...s");
		Matcher m= p.matcher("sas");
		
		boolean b= m.matches();
		System.out.println(b);
		
		boolean b1= Pattern.compile("..p").matcher("asp").matches()	;
		
		System.out.println(b1);
		
		boolean b2= Pattern.matches("..s", "aas");
		System.out.println(b2);
		
		System.out.println(Pattern.matches("[abc]{2}", "abc"));
		
		System.out.println(Pattern.matches("[abc]{2,6}", "aaaabb"));
		
		System.out.println(Pattern.matches("[^bc]{3,6}", "defijb"));
		
		System.out.println(Pattern.matches("[abc]*", "ab"));
		
		System.out.println(Pattern.matches("\\d","a"));
		
		System.out.println(Pattern.matches("\\D*", "abc"));
		
		
		System.out.println(Pattern.matches("[[a-z]{3}&&[A-Z]{1}&&[1-9]{2}]{6}", "Arun32"));
	}
}
