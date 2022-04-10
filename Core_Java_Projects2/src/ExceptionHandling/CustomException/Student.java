package ExceptionHandling.CustomException;

public class Student {
	
	private String name;
	private int age;
	
	

	public Student(String name, int age) throws AgeException{
		if(age<0) {
			throw new AgeException("Stident age cannot have negative: "+age);
		}else {
			this.name=name;
			this.age=age;
			System.out.println("Student object is created");
		}
	}
	
	public void dep() {
		System.out.println("");
	}



	public static void main(String[] args) {
		Student s=null;
		
		try {
			s=new Student("Raj", 10);
			
		}catch(AgeException e) {
			System.out.println(e.getMessage());
		}

	}

}
