package ExceptionHandling.ThrowsAndThrow;

public class myClass3_throw_keyword {

	public static void m3() {
		int input=10/0;
	}
	
	public static void m2() {
	m3();
	}
	
	public static void m1() {
		m2();
		throw new ArithmeticException("Not divided by zero");
	}
	
	public static void main(String[] args) {
		
		myClass2_try_catch.m1();
		System.out.println("Continue with normal flow..");
	}

}
