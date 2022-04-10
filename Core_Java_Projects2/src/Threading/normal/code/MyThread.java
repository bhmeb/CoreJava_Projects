package Threading.normal.code;

class Hi {
	public void show() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("Hi");
			try {Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Hello {
	public void show() {
		for (int i = 0; i <= 5; i++) {
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
		
		obj1.show();
		obj2.show();
	}
}

/*
			Output
			Hi
			Hi
			Hi
			Hi
			Hi
			Hi
			Hello
			Hello
			Hello
			Hello
			Hello
			Hello
*/
