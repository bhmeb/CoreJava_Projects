package Java7.String_Replacement;

public class ReplaceStringXtoY {
	
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

	public static void main(String[] args) {
		
		System.out.println(ReplaceStringXtoY.replaceChar("abxcxdx", 'x', 'y'));
	}

}
