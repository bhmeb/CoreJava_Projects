package Arrays;

import java.util.Scanner;

public class Array1DExample3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("How many string to store in Array?: ");
		String input[]=new String[sc.nextInt()];
		sc.nextLine();
		
		for(int i=0;i<input.length;i++) {
			System.out.println("Please enter input:- "+i);
			input[i]=sc.nextLine();
		}
		ArrayInput(input);
	}

	private static void ArrayInput(String[] input) {
		for (int i = 0; i < input.length; i++) {
			System.out.println(input[i]);
		}
	}
}
