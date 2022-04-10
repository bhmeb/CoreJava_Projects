package Threading.thread6.Runnable.AnnonymousClass;

/*class Hi implements Runnable{
	public void run() {
		for (int i = 0; i <5; i++) {
			System.out.println("Hi");
			try {Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
*/

/*class Hello implements Runnable{
	public void run() {
		for (int i = 0; i <5; i++) {
			System.out.println("Hello");
			try {Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}*/

public class MyThread {
	public static void main(String[] args) throws InterruptedException {
		
		Runnable obj1=new Runnable() { //No Hi class
			public void run() {
				for (int i = 0; i <5; i++) {
					System.out.println("Hi");
					try {Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		Runnable obj2=new Runnable() { //No Hello class
			public void run() {
				for (int i = 0; i <5; i++) {
					System.out.println("Hello");
					try {Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		
		Thread t1=new Thread(obj1); 
		Thread t2=new Thread(obj2);
		
		t1.join();
		t2.join();
		
		t1.start();
		try {Thread.sleep(10);} catch (InterruptedException e) {}
		t2.start();
		
	}
}
