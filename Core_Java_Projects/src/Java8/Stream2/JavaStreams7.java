package Java8.Stream2;

import java.util.Arrays;
import java.util.List;

public class JavaStreams7 {

	public static void main(String[] args) {
		
		//7. Stream from Array, sort, filter and print
		
		List<String> names = Arrays.asList("Raj", "Aryan", "Harish", "Sameer", "Punit");
	    
		names.stream()
		//.map(String::toLowerCase)
		.map(String::toUpperCase)
		.filter(p -> p.startsWith("S"))
		.forEach(System.out::println);
	}
}
