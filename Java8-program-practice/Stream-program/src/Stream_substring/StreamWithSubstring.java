package Stream_substring;

import java.util.Arrays;
import java.util.List;

public class StreamWithSubstring {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("abc1","abc2","abc3");
		long size = list.stream()
				        .skip(2)
				        .map(e -> e.substring(0,3))
				        .sorted()
				        .count();
		System.out.println(size);

	}

}
