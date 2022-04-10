package TypeReferenceDemo;

public class TypeReference {

	public static void main(String[] args) {
		
		MyInterface L = s->s.length();
		printLength(L);
	}

	private static void printLength(MyInterface l) {
		System.out.println(l.getLength("Print length"));	
	}
}
