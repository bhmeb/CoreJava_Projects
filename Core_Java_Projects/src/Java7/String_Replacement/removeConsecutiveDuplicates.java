package Java7.String_Replacement;

public class removeConsecutiveDuplicates {
	
	public static String removeConsecutiveDuplicatesvalues(String s) {
		
		if(s.length()<=1) {
			return s;
		}
		
		if(s.charAt(0)==s.charAt(1)) {
			return removeConsecutiveDuplicatesvalues(s.substring(1));
		}else {
			return s.charAt(0) + removeConsecutiveDuplicatesvalues(s.substring(1));
		}
	}

	public static void main(String[] args) {
		
		System.out.println(removeConsecutiveDuplicatesvalues("aabbaa"));
	}

}
