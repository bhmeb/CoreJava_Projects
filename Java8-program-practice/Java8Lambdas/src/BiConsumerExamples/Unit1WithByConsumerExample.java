package BiConsumerExamples;

import java.util.function.BiConsumer;

public class Unit1WithByConsumerExample {

	public static void main(String[] args) {
		
		int [] number = {1,2,3};
		int key = 2;
		process(number, key, (v , k)->System.out.println(v * k));
	}

	private static void process(int[] number, int key, BiConsumer<Integer, Integer> consumer) {
		for(int  i : number) {
			consumer.accept(i, key);
		}
	}
}
