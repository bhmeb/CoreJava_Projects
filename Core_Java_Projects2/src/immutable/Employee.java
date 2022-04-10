package immutable;

public final class Employee {
	
	private final int id;

	public Employee(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
		
	public static void main(String[] args) {
		Employee obj=new Employee(100);
		System.out.println(obj.getId());
	}
}
