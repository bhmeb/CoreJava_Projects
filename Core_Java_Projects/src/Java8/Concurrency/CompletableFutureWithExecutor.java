package Java8.Concurrency;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class CompletableFutureWithExecutor {
	
	public static void useCompletableFutureWithExecutor(List<MyTask> tasks) {
		  long start = System.nanoTime();
		  ExecutorService executor = Executors.newFixedThreadPool(Math.min(tasks.size(), 10));
		  List<CompletableFuture<Integer>> futures =
		      tasks.stream()
		           .map(t -> CompletableFuture.supplyAsync(() -> t.calculate(), executor))
		           .collect(Collectors.toList());
		 
		  List<Integer> result =
		      futures.stream()
		             .map(CompletableFuture::join)
		             .collect(Collectors.toList());
		  long duration = (System.nanoTime() - start) / 1_000_000;
		  System.out.printf("Processed %d tasks in %d millis\n", tasks.size(), duration);
		  System.out.println(result);
		  executor.shutdown();
		}
	
	public static void main(String[] args) {
		
		List<MyTask> tasks = IntStream.range(0, 10)
	            .mapToObj(i -> new MyTask(1))
	            .collect(Collectors.toList());
		
		CompletableFutureWithExecutor.useCompletableFutureWithExecutor(tasks);
		
	}

}
