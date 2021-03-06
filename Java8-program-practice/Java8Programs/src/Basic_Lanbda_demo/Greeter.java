package Basic_Lanbda_demo;

public class Greeter {
	
	public void greet(Greeting greeting) {
		greeting.perform();
	}

	public static void main(String[] args) {

		//Implementing function - java 8
		Greeting MyLambdaFunction = () -> System.out.println("Hello world!");
		
		
		//implementing class - java 7
		Greeter greet = new Greeter();
		
		//Inner class without naming any class
		Greeting innerClass = new Greeting() {
			public void perform() {
				System.out.println("Hello world!");
			}
		};
		greet.greet(innerClass);
		greet.greet(MyLambdaFunction);
	}
}










