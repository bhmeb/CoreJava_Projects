package ThisReferenceWithLambdaExample;

public class ThisReferenceExample {
	
	public static void doProcess(int i, Process p) {
		p.process(i);
	}
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		ThisReferenceExample thisRef = new ThisReferenceExample();
		
		//System.out.println(this); //this Cannot use this in a static context
		
		thisRef.doProcess(10, new Process() {

			@Override
			public void process(int i) {
				System.out.println("Value of i is: " + i);
				System.out.println(this);
			}
			
			public String toString() {
				return "This is annonymous inner class";
			}
		});
	}
	
	interface Process{
		void process(int i);
	}
}

