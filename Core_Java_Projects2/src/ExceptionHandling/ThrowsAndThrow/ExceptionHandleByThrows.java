package ExceptionHandling.ThrowsAndThrow;

public class ExceptionHandleByThrows {

	public static int divided(int x, int y) {
		int input = 0;
		try {
			input = x / y;
			System.out.println(input);
		} catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero");
		}
		return input;
	}

	public static void main(String[] args) throws ArithmeticException {
		divided(10, 2);
	}
}
