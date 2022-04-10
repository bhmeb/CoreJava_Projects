package ReverseINT;

public class reverseInt {

	public static void main(String[] args) {

		int i = 123;
		int rev = 0;
		int last_digt;

		while (i != 0) {
			last_digt = i % 10;
			if (last_digt % 2 != 0) {
				rev = rev * 10 + last_digt;
			}
			i = i / 10;
			System.out.println(i);
		}
	}
}