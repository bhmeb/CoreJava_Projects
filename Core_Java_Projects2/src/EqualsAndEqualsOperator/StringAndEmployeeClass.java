package EqualsAndEqualsOperator;

public class StringAndEmployeeClass {

	public static void main(String[] args) {
		
		String s1=new String("raj");  //Store in Heap
		Employee s2=new Employee("raj"); //Store in Heap
		
		System.out.println(s1.equals(s2)); //false.
		//System.out.println(s1==s2); //Not possible because Incompatible operand type String and Employee
		
		System.out.println("------------------------------------");
		
		
		String s3=s1; //from Heap s1 copied to s3 into Heap. both s3 and s1 having the same memory address
		System.out.println(s1.equals(s3));
		System.out.println("s3==s1: "+(s3==s1)); //true
		
		System.out.println("------------------------------------");
		
		String s4="aryan"; //stored in SCP area
		System.out.println(s3.equals(s4));
		System.out.println("s4==s3: "+(s4==s3)); //false. both are having in difference memory area.
		
		
		System.out.println("------------------------------------");
		int hash1=s1.hashCode();
		int hash2=s2.hashCode();
		System.out.println("Name1: "+hash1+" \nName2: "+hash2);

	}
}

class Employee{
	int id;
	String name;
	
	Employee(String name){
		this.name=name;
	}
}
