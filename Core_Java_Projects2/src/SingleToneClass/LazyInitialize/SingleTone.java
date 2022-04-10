package SingleToneClass.LazyInitialize;


public class SingleTone {

	private static SingleTone instance=null; // lazy initialize no final

	private SingleTone() {
	}

	public static SingleTone getInstance() {
		if(instance==null) {
			instance=new SingleTone();
			return instance;
		}else {
			return instance;
		}
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
