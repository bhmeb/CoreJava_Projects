package Stream_substring;

import java.util.Arrays;
import java.util.List;

public class StreamExample {

	public static void main(String[] args) {
			
		List<String> myList =
				Arrays.asList("d2", "a2", "b1", "b3", "c");
		      
		myList.stream()
				.filter(s -> {
				    System.out.println("filter: " + s);
				    return s.startsWith("a");
				})
				.sorted((s1, s2) -> {
				    System.out.printf("sort: %s; %s\n", s1, s2);
				    return s1.compareTo(s2);
				})
				.map(s -> {
				    System.out.println("map: " + s);
				    return s.toUpperCase();
				})
				.forEach(s -> System.out.println("forEach: " + s));
	}
}
