package Java8.Stream2;

import java.util.stream.Stream;

public class JavaStreams4 {

	public static void main(String[] args) {
		
		//4. Stream.of, sorted and findFirst
		 Stream.of("Harish", "Abhi", "Sameer")
		 .sorted()
		 .findFirst()
		 .ifPresent(System.out::println);
	}
}
