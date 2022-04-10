package MiniProject.V1;

public class TypeInterfaceExample {
	
	public static void main(String[] args) {
		
		//StringLengthlambda myLambda = (String s) -> s.length(); 
		//StringLengthlambda myLambda =  (s) -> s.length(); 
		StringLengthlambda myLambda =  s -> s.length(); 
		System.out.println(myLambda.getLength("Hello"));
	}
	
	interface StringLengthlambda{
		int getLength(String s);
	}
}

