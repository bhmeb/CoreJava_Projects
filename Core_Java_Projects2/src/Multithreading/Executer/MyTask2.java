package Multithreading.Executer;

public class MyTask2 implements Runnable{

String name;
	
	MyTask2(String name){
		this.name=name;
	}
	
	@Override
	public void run() {
		
			System.out.println(Thread.currentThread().getName()+" starting"+name);
			processCommand();
			System.out.println(Thread.currentThread().getName()+" end");
	}
	
    private void processCommand() {
        try {Thread.sleep(5000);} catch (InterruptedException e) {}
    }
}
