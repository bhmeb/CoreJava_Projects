package Multithreading.InterThreadCommunication;

public class Test {

	public static void main(String[] args) {
		
		SuperClass q=new SuperClass();
		new Producer(q);
		new Consumer(q);
	}

}
