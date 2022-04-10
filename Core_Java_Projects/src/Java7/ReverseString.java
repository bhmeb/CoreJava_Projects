package Java7;

public class ReverseString {

	public static void main(String[] args) {
		
		String name = "Harish";
		
		String reverse = "";
		
		for (int i=name.length()-1; i>=0;i--) {
			reverse = reverse + name.charAt(i);
		}
		System.out.println("Before reverse");
		System.out.println("Original name : " + name);
		
		System.out.println("After reverse");
		System.out.println("reverse name : " + reverse);
	}

}