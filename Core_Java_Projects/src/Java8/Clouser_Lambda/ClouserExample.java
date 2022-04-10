package Java8.Clouser_Lambda;

public class ClouserExample {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20; //it's explicitly final value
		doProcess(a, new Process() {
			
			@Override
			public void process(int i) {
				//b = 30;  //not possible to re-initialize value. because it's explicitly final
				System.out.println(i + b);
			}	
		});
	}
	
	public static void doProcess(int i, Process p) {
		p.process(i);
	}
	
	interface Process{
		void process(int i);
	}
}
