package InputFromUser;
import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		
		System.out.println("Take a string input from user: ");
		Scanner sc =new Scanner(System.in);
		String s1=sc.nextLine();
		System.out.println(s1);
	}
}
