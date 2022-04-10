package String_operations.operation5;

public class Employee {

	/*
	operation with 
	replace
    replaceAll
    replaceFirst.
	 */

	String address = "Kolkata 4001 Park street";
	
	public void Replace() {
		String rep=address.replace("Kolkata", "Mumbai"); //replace(target, replacement)
		System.out.println(rep);
	}
	
	public void ReplaceAll() {
		String rep=address.replaceAll("\\s", ""); //replaceAll(regex, replacement)
		System.out.println(rep);
	}
	
	public void ReplaceAll2() {
		String rep=address.replaceAll("a", "e"); // replaceAll(char oldChar, char newChar)  
		System.out.println(rep);
	}
	
	public void ReplaceFirst() {
		String rep=address.replaceFirst("P", "9"); //replaceFirst(regex, replacement)
		System.out.println(rep);
	}
}