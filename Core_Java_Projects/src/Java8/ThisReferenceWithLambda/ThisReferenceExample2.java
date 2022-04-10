package Java8.ThisReferenceWithLambda;

public class ThisReferenceExample2 {
	
	public static void doProcess(int i, Process p) {
		p.process(i);
	}
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		ThisReferenceExample2 thisRef = new ThisReferenceExample2();
		
		thisRef.doProcess(10, i -> {
			System.out.println("Value of i is: " + i);
			//System.out.println(this); //Cannot use this in a static context
		});
	}
	
	interface Process{
		void process(int i);
	}
}

