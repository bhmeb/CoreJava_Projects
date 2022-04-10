package Arrays;

public class Array2DExampl2 {

	public static void main(String[] args) {

		int[][] input = { { 1, 2, 3 }, { 4, 5, 6 } };

		ArrayInput(input);
	}

	private static void ArrayInput(int[][] input) {
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input[i].length; j++) {
				System.out.println(input[i][j]);
			}
		}
	}
}
