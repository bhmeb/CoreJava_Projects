package ExceptionHandling.ThrowsAndThrow;

public class ExceptionHandleByThrow {

	public static int divided(int x,int y) {
		
		if(x==0) {
			throw new ArithmeticException("Divider cannot be equal to zero!");//custom message will not display. required try/catch to catch the exception
		}
		return x/y;
	}

	public static void main(String[] args) {
		divided(10, 0);
	}

}
