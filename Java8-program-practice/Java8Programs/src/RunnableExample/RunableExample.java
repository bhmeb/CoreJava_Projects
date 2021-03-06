package RunnableExample;

public class RunableExample {

	public static void main(String[] args) {
		

		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
              System.out.println("Print inside runnable");
			}
		});
		t.run();
		
		//implement lambda
		Thread thread = new Thread(() -> System.out.println("Print inside runnable"));
		thread.run();
	}
}
