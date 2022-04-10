package Multithreading.InterThreadCommunication;

public class Consumer implements Runnable{

	SuperClass q;

	public Consumer(SuperClass q) {
		this.q = q;
		Thread t2=new Thread(this, "Producer");
		t2.start();
	}
	
	public void run() {
		
		while(true) {
			q.get();
			try {Thread.sleep(1000);} catch (Exception e) {}
		}
	}
}
