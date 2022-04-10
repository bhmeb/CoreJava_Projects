package InputFromUser;

import java.util.Scanner;

public class MultipleInput {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("How many number wants?: ");
		String input[] = new String[sc.nextInt()]; //Suppose you entered 3 and 3 will store in array{0,1,2}
		sc.nextLine(); //cursor will come next line only.
	
		for (int i = 0; i < input.length; i++) {
			System.out.println("Please enter input:- "+i);
			input[i] = sc.nextLine();
		}
		
		System.out.println("You have entired: ");

		for(String s:input) {
			System.out.println(s);
		}

	}

}
