package String_operations.operation5_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample1 {

	public static void main(String[] args) {

		/*
		 * MatchResult interface 
		 * Matcher class 
		 * Pattern class 
		 * Pattern SyntaxException
		 * class
		 */

		//way1
		Pattern p = Pattern.compile(".n");
		Matcher m = p.matcher("In");
		boolean b = m.matches();
		System.out.println(b);
		
		//way2
		boolean b2=Pattern.compile(".n").matcher("In").matches();
		System.out.println(b2);
		
		//way3
		boolean b3=Pattern.matches(".n", "In");
		System.out.println(b3);
	}
}