package Java8.Lambda_try_catch;

import java.util.function.BiConsumer;

public class HandlingException1 {

	public static void main(String[] args) {
		
		int [] number = {1,2,3};
		int key = 0;
		
		process(number, key, (v , k)->System.out.println(v / k));
	}

	private static void process(int[] number, int key, BiConsumer<Integer, Integer> consumer) {
		for (int i : number) {
			try {
				
				consumer.accept(i, key);
				
			}catch(ArithmeticException e ) {
				System.out.println("Error occour");
			}
		}
	}
}
