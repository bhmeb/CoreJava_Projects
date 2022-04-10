package ExceptionHandling.ThrowsAndThrow;

public class ExceptionHandleByThrow2 {

	public static void divided(int x,int y) {
		try {
		if(y==0) {
			throw new ArithmeticException();
		}else {
			System.out.println(x/y);
		}
		
		}catch(Exception e) {
			System.out.println("Cannot devide by zero!");
		}
	}

	public static void main(String[] args) {
		divided(10, 2);
	}

}
