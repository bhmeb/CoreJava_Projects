package Java8.Concurrency;

public class MyTask {
	
	 private final int duration;
	  public MyTask(int duration) {
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
}
