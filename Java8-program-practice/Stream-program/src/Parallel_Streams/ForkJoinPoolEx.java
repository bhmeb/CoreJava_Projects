package Parallel_Streams;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinPoolEx {

    public static void main(String[] args) {
	ForkJoinPool commonPool = ForkJoinPool.commonPool();
	System.out.println(commonPool.getParallelism());    // 3

    }
}

//common pool is initialized with a parallelism of 3 per default. 