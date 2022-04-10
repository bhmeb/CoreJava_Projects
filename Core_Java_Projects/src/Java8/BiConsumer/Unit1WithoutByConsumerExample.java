package Java8.BiConsumer;

public class Unit1WithoutByConsumerExample {

	public static void main(String[] args) {
		
		int [] number = {1,2,3};
		int key = 2;
		
		process(number, key);

	}

	private static void process(int[] number, int key) {
		
		for(int  i : number) {
			System.out.println(i * key);
		}
	}
}
