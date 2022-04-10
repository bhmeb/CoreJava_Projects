package com.java8_v1;

public class RunnableExample {

	public static void main(String[] args) {
		
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Printed inside runnable");
			}
		});
		
		t.run();
		
		//the same thing did it as above.  
		Thread myThread = new Thread(() -> System.out.println("Printed inside lambda runnable"));
		myThread.run();
	}
}
