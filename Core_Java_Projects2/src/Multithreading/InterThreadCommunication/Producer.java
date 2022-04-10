package Multithreading.InterThreadCommunication;

public class Producer implements Runnable {

	SuperClass q;

	public Producer(SuperClass q) {
		this.q = q;
		Thread t1=new Thread(this, "Concumer");
		t1.start();
	}

	public void run() {
		int i = 0;
		while (true) {
			q.put(i++);
			try {Thread.sleep(1000);} catch (Exception e) {}
		}
	}
}
