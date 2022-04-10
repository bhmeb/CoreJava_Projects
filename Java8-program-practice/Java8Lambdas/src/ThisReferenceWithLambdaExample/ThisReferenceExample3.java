package ThisReferenceWithLambdaExample;

public class ThisReferenceExample3 {
	
	public static void doProcess(int i, Process p) {
		p.process(i);
	}
	
	public void execute() {
		doProcess(10, i -> {
			System.out.println("Value of i is: " + i);
			System.out.println(this); //this will work
		});
	}
	
	public static void main(String[] args) {
		ThisReferenceExample3 thisRef = new ThisReferenceExample3();
		thisRef.execute();
	}
	
	public String toString() {
		return "This is main ThisReferenceExample class instance";
	}
	
	interface Process{
		void process(int i);
	}
}

