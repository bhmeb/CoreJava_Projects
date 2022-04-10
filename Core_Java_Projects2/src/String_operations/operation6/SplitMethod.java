package String_operations.operation6;

public class SplitMethod {

	public static void main(String[] args) {

		/*
		 * split
		 */

		String address = "Kolkata 4001 Park street";
		String[] s = address.split(" "); //or \\s both are same for white space
		for (String s1 : s) {
			System.out.println(s1);
		}
		
		System.out.println("---------");
		String[] ss = address.split(" ", 1);
		for (String s2 : ss) {
			System.out.println(s2);
		}
		
		System.out.println("---------");
		String[] sss = address.split(" ", 2);
		for (String s3 : sss) {
			System.out.println(s3);
		}
		
		System.out.println("---------");
		String[] ssss = address.split(" ", 3);
		for (String s4 : ssss) {
			System.out.println(s4);
		}
	}
}