package Java8.BiConsumer;

import java.util.function.BiConsumer;

public class Unit1WithByConsumerHandlingException {

	public static void main(String[] args) {
		
		int [] number = {1,2,3};
		int key = 0;
		//process(number, key, (v , k)->System.out.println(v / k));
		
		process(number, key, (v , k)->{
			try {System.out.println(v / k);
			}catch (ArithmeticException e) {System.out.println(e);}
		});
	}

	private static void process(int[] number, int key, BiConsumer<Integer, Integer> consumer) {
		for(int  i : number) {
			consumer.accept(i, key);
			
			/*try {
				consumer.accept(i, key);
			}catch (ArithmeticException e) {
				System.out.println(e);
			}*/
		}
	}
}
