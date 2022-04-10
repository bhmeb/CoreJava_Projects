package Arrays;

public class Array1DExample2 {

	public static void main(String[] args) {

		int[] input = { 1, 2, 3 };

		ArrayInput(input);
	}

	private static void ArrayInput(int[] input) {
		for (int i = 0; i < input.length; i++) {
			System.out.println(input[i]);
		}
	}
}
