package Multithreading.org.multithread;
class counter2 {

	int count;

	public void increment() {
		count++;
	}
}

public class WithoutSynchronize {

	public static void main(String[] args) throws InterruptedException {

		counter2 c = new counter2();

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i <1000; i++) {
					c.increment();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i <1000; i++) {
					c.increment();
				}
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("count :"+c.count);
	}

}
