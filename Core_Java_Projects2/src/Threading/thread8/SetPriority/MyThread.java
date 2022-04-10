package Threading.thread8.SetPriority;

public class MyThread {
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
		
		//we can change thread name also
		t1.setName("Hi-Thread");
		t2.setName("Hello-Thread");
		
		//Print thread name
		System.out.println(t1.getName());
		System.out.println(t2.getName());

		t1.start();
		try {Thread.sleep(10);} catch (InterruptedException e) {}
		t2.start();
		
		t1.join();
		t2.join();

		System.out.println(t1.isAlive());
		
		System.out.println("Main-Thread");
	}
}
