package Java7.String_Replacement;

public class RemoveX_Example2 {
	
	public static String removeX(String input){
	{
		if(input.equals("")) 
			return "";
		
		if(input.charAt(0) == 'x')  
		{
			return(removeX(input.substring(1)));
		}
		else   
		{
			input = input.charAt(0)+removeX(input.substring(1));
			return input;
		}
	}
	}
	public static void main(String[] args) {
		
        String s = "abxcdx";
		
		System.out.println(removeX(s));
	}

}
