package Java8.Stream2;

import java.util.Arrays;

public class JavaStreams5 {

	public static void main(String[] args) {
		
		//5. Stream from Array, sort, filter and print
		
		String[] names = {"Raj", "Aryan", "Harish", "Sameer", "Punit"};
	    
		Arrays.stream(names)   //Same as Streams.of(names)
		.filter(p -> p.startsWith("H"))
		.sorted()
		.forEach(System.out::println);
	}
}
