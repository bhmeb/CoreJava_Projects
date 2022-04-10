package String_operations.operation3;

public class Employee {

	/*
	 * operation with 
	 * trim toLowerCase() 
	 * toUpper()
	 */

	public void trim() {

		String s1 = " Hi Raj ";
		System.out.println(s1 + " how are you?");
		System.out.println(name1.trim() + " how are you?");
	}

	public void toLowerCase() {
		String s1="HEY BRO WHAT'S UP!";
		System.out.println(s1.toLowerCase());
	}

	public void toUpper() {
		System.out.println(address.toUpperCase());
	}

	String name1 = "Raj";
	String name2 = "Harish";
	String address = "Kolkata 4001 Park street";

	public void concat() {
		String name3 = "";
		name3 = name1.concat(name2);
		System.out.println(name3);
	}

	public void isEmpty() {
		String name4 = "";
		System.out.println(name1.isEmpty());
		System.out.println(name4.isEmpty());
	}

	public int length() {

		int len = name1.length();
		int len2 = name2.length();
		System.out.println("Name1 object length is: " + len + " \nand name2 length is: " + len2);

		System.out.println("\n");
		// Find index position in array
		String[] value = { "name1", "name2" };

		for (int i = 0; i < value.length; i++) {
			System.out.println("Value of index " + i + "-->" + value[i]);
		}

		System.out.println("\n");
		// Find value at index using charAt()
		for (int i = 0; i < len; i++) {
			System.out.println(i + "-->" + name1.charAt(i));
		}

		System.out.println("\n");
		for (int i = 0; i < len2; i++) {
			System.out.println(i + "-->" + name2.charAt(i));
		}

		return len;
	}
}
