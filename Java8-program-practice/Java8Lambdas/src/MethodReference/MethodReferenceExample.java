package MethodReference;

public class MethodReferenceExample {
	
	public static void main(String[] args) {
		
		MethodReferenceExample.printMessage();  //way1 simply print static method by class name
		
		Thread t = new Thread(() ->printMessage()); //way2 Lambda expression
		t.start();
		
		Thread t2 = new Thread(MethodReferenceExample::printMessage); //way3 Method reference
		t2.start();
		
	}
	
	public static void printMessage() {
		System.out.println("Hello");
	}

}
