package Java7.String_Replacement;

public class Replace_pi_with_value {
	
	//Replace char
	public static String replaceChar(String org, char a, char b) {
		if(org.length()==0) {
			return org;
		}
		
		String smallOutput = replaceChar(org.substring(1),a,b);
		
		if(org.charAt(0)==a) {
			return b + smallOutput;
		}else {
			return org.charAt(0) + smallOutput;
		}
	}
	
	//Replace pi value to 3.14
	public static String replacePi(String i) {
		
		//base case
		if(i.length() <= 0) { 
			return i;
		}
		
		if(i.charAt(0) == 'p' && i.charAt(1) == 'i') {
			//call recursion on string of length n-2
			String smallOutput = replacePi(i.substring(2));
			return "3.14" + smallOutput;
		}else {
			//call recursion on string of length n-1
			String smallOutput = replacePi(i.substring(1));
			return i.charAt(0) + smallOutput;
		}
		
	}

	public static void main(String[] args) {
		
		System.out.println(Replace_pi_with_value.replaceChar("abxcxdx", 'x', 'y'));
		System.out.println(Replace_pi_with_value.replacePi("apibcd"));
		
	}

}
