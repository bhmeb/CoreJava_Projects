package MiniProject.Java7;

public class Greeter {
	
	public void greet(Greeting greeting) {
		greeting.perform();
		//System.out.println("Hello world");
	}

	public static void main(String[] args) {
		Greeter gr = new Greeter();
		GreetingImp gm = new GreetingImp();
		gr.greet(gm);
		//gr.greet();
	}
}
