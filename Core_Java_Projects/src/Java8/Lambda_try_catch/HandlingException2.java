package Java8.Lambda_try_catch;

import java.util.function.BiConsumer;

public class HandlingException2 {

	public static void main(String[] args) {
		
		int [] number = {1,2,3};
		int key = 0;
	
		process(number, key, (v , k)->{
			try {System.out.println(v / k);  //This is the best way to catch exception
			}catch (ArithmeticException e) {System.out.println(e);}
		});
	}

	private static void process(int[] number, int key, BiConsumer<Integer, Integer> consumer) {
		for(int  i : number) {
			consumer.accept(i, key);
		}
	}
}
