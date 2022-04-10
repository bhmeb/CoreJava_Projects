package SingleToneClass;

public class SingleToneExample {
	
	private static SingleToneExample instance=null;
	
	private SingleToneExample() {}
	
	public static SingleToneExample getInstance() {
		if(instance==null) {
			instance=new SingleToneExample();
			return instance;
		}else {
			return instance;
		}
	}
	
	public void print() {
		System.out.println("I'm printed from singleTone class");
	}
	
	public static void main(String[] args) {
		
		SingleToneExample obj=SingleToneExample.getInstance();
		obj.print();
		SingleToneExample obj2=SingleToneExample.getInstance();
		obj2.print();
		
		System.out.println(obj.hashCode());
		System.out.println(obj2.hashCode());
		
		System.out.println(obj.equals(obj2)); //true
		System.out.println(obj==obj2); //true
	}

}
