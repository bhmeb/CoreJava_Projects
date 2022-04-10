package SingleToneClass.EarlyInitialize;

public class SingleTone {

	private final static SingleTone instance = new SingleTone(); // early initialize and final

	private SingleTone() {
	}

	public static SingleTone getInstance() {
		return instance;
	}

	public static void main(String[] args) {
		SingleTone obj = SingleTone.getInstance();
		SingleTone obj2 = SingleTone.getInstance();

		System.out.println(obj.hashCode());
		System.out.println(obj2.hashCode());

		System.out.println(obj.equals(obj2)); // true
		System.out.println(obj == obj2); // true
	}

}
