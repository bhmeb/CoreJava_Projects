package Clouser_Lambda_Expression;

public class ClouserExample2 {

	public static void main(String[] args) {

		int a = 10;
		int b = 20; // it's explicitly final value
		doProcess(a, (i) -> System.out.println(i + b));
	}

	public static void doProcess(int i, Process p) {
		p.process(i);
	}

	interface Process {
		void process(int i);
	}
}
