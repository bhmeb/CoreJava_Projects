package Java7;

public class Compare2Object {
	
	private int Id;
	private String name;
	
	public Compare2Object(int id, String name) {
		Id = id;
		this.name = name;
	}
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
     
		Compare2Object obj1 = new Compare2Object(1, "Raj");
		Compare2Object obj2 = new Compare2Object(1, "Abhi");	
		
		int a = obj1.hashCode();
		int b = obj2.hashCode();
		System.out.println("HasCode for emp1" + a);
		System.out.println("HasCode for emp2" + b);
		System.out.println("Comparing obj1 and obj2 = " + obj1.equals(obj2));
	}
}
