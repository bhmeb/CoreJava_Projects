package Streams_Part2;

import java.util.stream.IntStream;

public class JavaStreams {

	public static void main(String[] args) {
		
		//1. Integer Streams
		
		IntStream
		.range(1, 10)
		.forEach(System.out::println);
	}
}
