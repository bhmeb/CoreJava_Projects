package Threading.thread8.SetPriority;

public class MyThread4 {
	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Hi " + Thread.currentThread().getPriority());
				try {Thread.sleep(1000);} catch (InterruptedException e) {}
			}
		});

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Hello " + Thread.currentThread().getPriority());
				try {Thread.sleep(1000);} catch (InterruptedException e) {}
			}
		});
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
	
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());

		t1.start();
		try {Thread.sleep(10);} catch (InterruptedException e) {}
		t2.start();
		
		t1.join();
		t2.join();

		System.out.println(t1.isAlive());
		
		System.out.println("Main-Thread");
	}
}
