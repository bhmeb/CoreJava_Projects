package Java8.Concurrency;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class CompletableFuturesClass {
	
	public static void useCompletableFuture(List<MyTask> tasks) {
		  long start = System.nanoTime();
		  List<CompletableFuture<Integer>> futures =
		      tasks.stream()
		           .map(t -> CompletableFuture.supplyAsync(() -> t.calculate()))
		           .collect(Collectors.toList());
		 
		  List<Integer> result =
		      futures.stream()
		             .map(CompletableFuture::join)
		             .collect(Collectors.toList());
		  long duration = (System.nanoTime() - start) / 1_000_000;
		  System.out.printf("Processed %d tasks in %d millis\n", tasks.size(), duration);
		  System.out.println(result);
		}

	public static void main(String[] args) {
		
		
		List<MyTask> tasks = IntStream.range(0, 10)
	            .mapToObj(i -> new MyTask(1))
	            .collect(Collectors.toList());
		
		CompletableFuturesClass.useCompletableFuture(tasks);

	}

}
