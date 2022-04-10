package com.java8;

public class Greeter {
	
	public void greet(Greeting greeting) {
		greeting.perform();
	}
	
	public static void main(String[] args) {
		
		Greeter g = new Greeter();

		Greeting gm = new GreetingImp();
		Greeting PrintHelloWorld = () -> System.out.print("Hello world!!");
		gm.perform();
		PrintHelloWorld.perform();
		
		
		Greeting InnerClass = new Greeting() {			
			public void perform() {	
				System.out.print("Hello world!!");
			}
		};
		InnerClass.perform();
		
		g.greet(InnerClass);
		g.greet(PrintHelloWorld);
	}
}




