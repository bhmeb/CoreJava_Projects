package MethodOverriding;


class parent{
	void camera() {
		System.out.println("20mps");
	}
}

class child extends parent{
	void camera() {
		System.out.println("30mp");
	}
}

public class Method_Overriding {
	
	public static void main(String[] args) {
		
		parent obj=new parent();
		obj.camera();
		
		child c= new child();
		c.camera();
	}

}
