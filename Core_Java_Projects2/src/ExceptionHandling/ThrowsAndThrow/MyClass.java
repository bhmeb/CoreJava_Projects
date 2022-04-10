package ExceptionHandling.ThrowsAndThrow;

public class MyClass {
	
	public static void main(String[] args) {
		
		try {
			int x=10/0;	
			throw new ArithmeticException();
			
		}catch(ArithmeticException e) {
			System.out.println("Zero cannot be devied by zero");
		}
	}
}
