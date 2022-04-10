package Threading.thread;

class Hi extends Thread{
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

class Hello extends Thread{
	public void run() {
		for (int i = 0; i <5; i++) {
			System.out.println("Hello");
			try {Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class MyThread {
	public static void main(String[] args) {
		
		Hi obj1=new Hi();
		Hello obj2=new Hello();
		
		obj1.start();
		obj2.start();
	}
}


/*
 * here is some problem that hello print twice togather
 * But we want Hi then Hello
 Output
Hi
Hello
Hello
Hi
Hi
Hello
Hello
Hi
Hi
Hello
*/
