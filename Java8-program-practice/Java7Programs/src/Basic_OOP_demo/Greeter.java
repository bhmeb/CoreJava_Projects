package Basic_OOP_demo;

public class Greeter {
	
	public void greet(Greeting greeting) {
		greeting.perform();
	}

	public static void main(String[] args) {
		
		Greeter obj = new Greeter();
		GreetingImp obj2 = new GreetingImp();
		obj.greet(obj2);
	}
}










