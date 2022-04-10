package StaticMethod_Override;


class parent{
	static void camera() {
		System.out.println("20mps");
	}
}

class child extends parent{
	static void camera() {
		System.out.println("30mp");
	}
}

public class StaticMethod_Overriding {
	
	public static void main(String[] args) {

		parent.camera();
		child.camera();
	}

}
