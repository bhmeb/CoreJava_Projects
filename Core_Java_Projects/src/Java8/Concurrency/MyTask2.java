package Java8.Concurrency;

import java.util.List;
import java.util.stream.Collectors;

public class MyTask2 {
	
		  private final int duration;
		  public MyTask2(int duration) {
		    this.duration = duration;
		  }
		  public int calculate() {
		    System.out.println(Thread.currentThread().getName());
		    try {
		      Thread.sleep(duration * 1000);
		    } catch (final InterruptedException e) {
		      throw new RuntimeException(e);
		    }
		    return duration;
		  }
		  
		  public static void runSequentially(List<MyTask2> tasks) {
			  long start = System.nanoTime();
			  List<Integer> result = tasks.stream()
			                              .map(MyTask2::calculate)
			                              .collect(Collectors.toList());
			  long duration = (System.nanoTime() - start) / 1_000_000;
			  System.out.printf("Processed %d tasks in %d millis\n", tasks.size(), duration);
			  System.out.println(result);
			}
		  
	public static void main(String[] args) {
		
	}

}



