package Java7.String_Replacement;

public class RemoveX {
	
	public static String removeX(String str, char input[]) {
	  
		if(str.length()==0) {
			return str;
		}
		
		if(str.charAt(0)=='x') {
			return removeX(str.substring(1),input);
		}
		else {
			String str2 = str.charAt(0) + removeX(str.substring(1),input);
			return str2; 
		}

	}


	public static void main(String[] args) {
		
		String s = "abxcdx";
		char[] input = {'x'};
		
		System.out.println(RemoveX.removeX(s, input));
	}
}
