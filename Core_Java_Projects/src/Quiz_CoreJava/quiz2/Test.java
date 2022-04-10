package Quiz_CoreJava.quiz2;

public class Test {

	public static void main(String[] args) {

	Quiz obj=new Quiz();
	obj.initialise();
	obj.SetQuestion();
	obj.SetAnswer();
	obj.SetOption();
	obj.runner();
	obj.result();
	}
}
