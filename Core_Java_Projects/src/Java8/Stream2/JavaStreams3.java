package Java8.Stream2;

import java.util.stream.IntStream;

public class JavaStreams3 {

	public static void main(String[] args) {
		
		//3. Integer Streams
		
		System.out.println(
				IntStream
				.range(1, 10)
				.sum());
	}
}
