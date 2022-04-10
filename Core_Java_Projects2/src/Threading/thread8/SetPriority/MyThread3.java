package Threading.thread8.SetPriority;

public class MyThread3 {
	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Hi");
				try {Thread.sleep(1000);} catch (InterruptedException e) {}
			}
		});

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Hello");
				try {Thread.sleep(1000);} catch (InterruptedException e) {}
			}
		});
		
		//Default 5
		//Min 1
		//Max 10
		
		//set priority
		//t1.setPriority(1);
		//t2.setPriority(10);
		
		//Or We can use constant for Thread priority
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		//get priority
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
