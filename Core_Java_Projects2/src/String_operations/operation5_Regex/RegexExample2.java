package String_operations.operation5_Regex;

import java.util.regex.Pattern;

public class RegexExample2 {

	public static void main(String[] args) {
		
		System.out.println(Pattern.matches(".o", "Ko"));//true (2nd char is o)  
		System.out.println(Pattern.matches(".k", "Ko"));//false (2nd char is not k )  
		System.out.println(Pattern.matches(".s", "mst"));//false (has more than 2 char)  
		System.out.println(Pattern.matches(".s", "amms"));//false (has more than 2 char)  
		System.out.println(Pattern.matches("..s", "mas"));//true (3rd char is s)  
	}

}
