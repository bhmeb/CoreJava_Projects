package Java8.Stream2;

import java.util.Arrays;

public class JavaStreams6 {

	public static void main(String[] args) {
		
		//6. Average of squares of an int array
		
		Arrays.stream(new int[] {1,2,3,4})
		.map(p -> p* p)
		.average()
		.ifPresent(System.out::println);
	}
}
