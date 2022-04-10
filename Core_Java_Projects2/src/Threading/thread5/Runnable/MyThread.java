package Threading.thread5.Runnable;

class Hi implements Runnable{
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

class Hello implements Runnable{
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
		
		//Hi obj1=new Hi();
		//Hello obj2=new Hello();
		
		
		//Or, because Hi and Hello implements Runnable interface and
		//We can pass the Reference object of Runnable interface
		Runnable obj1=new Hi();
		Runnable obj2=new Hello();
		
		
		//Thread accept Runnable interface object
		Thread t1=new Thread(obj1); 
		Thread t2=new Thread(obj2);
	
		t1.start();
		try {Thread.sleep(10);} catch (InterruptedException e) {}
		t2.start();
	}
}
