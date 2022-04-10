package MiniProject.V1;

public class TypeInterfaceExample2 {
	
	public static void main(String[] args) {
		printLambda(s -> s.length());
	}
	
	public static void printLambda(StringLengthlambda L) {
		System.out.println(L.getLength("Hello Lambda"));
	}
	
	interface StringLengthlambda{
		int getLength(String s);
	}
}

