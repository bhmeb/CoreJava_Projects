package Threading.thread7.Runnable.LambdaExpression;

public class MyThread2 {
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

		t1.start();
		try {Thread.sleep(10);} catch (InterruptedException e) {}
		t2.start();
		
		t1.join();
		t2.join();

		System.out.println(t1.isAlive());
		
		System.out.println("Main-Thread");
	}
}
