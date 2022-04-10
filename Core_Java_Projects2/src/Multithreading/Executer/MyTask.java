package Multithreading.Executer;

public class MyTask implements Runnable{
	
	String name;
	
	MyTask(String name){
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
