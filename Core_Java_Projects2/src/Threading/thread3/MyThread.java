package Threading.thread3;

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
	public static void main(String[] args) throws InterruptedException {
		
		Hi obj1=new Hi();
		Hello obj2=new Hello();
		
		obj1.start();
		try {Thread.sleep(10);} catch (InterruptedException e) {}
		obj2.start();
		
		System.out.println("bye");
	}
}

/*
Now, output is not perfect, bye executed before Hello.
Solution on org.thread4. see the code 
Hi
bye ------------->bye is executed by main thread
Hello
Hi
Hello
Hi
Hello
Hi
Hello
Hi
Hello

*/