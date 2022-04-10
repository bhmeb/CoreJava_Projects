package ExceptionHandling.ThrowsAndThrow;

public class myClass2_try_catch {
	
	public static void m3() {
		int input=10/0;
	}
	
	public static void m2() {
	m3();
	}
	
	public static void m1() {
		try {
		m2();
		}catch(Exception e) {
			System.out.println("Exception is handled here");
		}
	}

	public static void main(String[] args) {
		
		myClass2_try_catch.m1();
		System.out.println("Continue with normal flow");
	}

}
