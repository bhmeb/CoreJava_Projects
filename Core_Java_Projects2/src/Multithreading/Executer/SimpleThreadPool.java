package Multithreading.Executer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleThreadPool {

	public static void main(String[] args) {
		
		ExecutorService executor=Executors.newFixedThreadPool(5);
		for(int i=0;i<10;i++) {
			Runnable task=new MyTask(" "+i);
			executor.execute(task);
		}
		executor.shutdown();
        while (!executor.isTerminated()) {
        }
	System.out.println("Finished all threads");
	}
}
