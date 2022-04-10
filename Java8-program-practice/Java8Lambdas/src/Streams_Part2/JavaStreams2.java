package Streams_Part2;

import java.util.stream.IntStream;

public class JavaStreams2 {

	public static void main(String[] args) {
		
		//2. Integer Streams
		
		IntStream
		.range(1, 10)
		.skip(5)   //skip first 5 element 1,2,3,4,5
		//.forEach(System.out::println);  // method ref
		.forEach(p -> System.out.println(p));  //lambda exp
	}
}
