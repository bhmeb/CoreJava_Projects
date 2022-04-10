package String_operations.operation4;

public class Employee {

	/*
	operation with 
	compareTo()
	valueOf
	 */
	
	String name1 = "Raj";
	String name2 = "Harish";
	String name = "Harish";
	String address = "Kolkata 4001 Park street";
	
	public void compareTo() {
		System.out.println(name.compareTo(name1));
		System.out.println(name.compareTo(name2));
	}
	
	public void valueOf() {
		int a=10;
		String s1=String.valueOf(a);  //String
		System.out.println(s1+17); //output 1017 because of string
	}
	
	public static String valueOfBoolean() {
		boolean b=true;
		boolean b2=false;
		String s1=String.valueOf(b);
		String s2=String.valueOf(b2);
		System.out.println(s1+"\n"+s2);
		return s1;
	}
	
	public static String valueOfChar() {
		
		char ch1='A';
		char ch2='B';
		
		String s1=String.valueOf(ch1);
		String s2=String.valueOf(ch2);
		System.out.println(s1+"\n"+s2);
		
		return s1;
	}
}
