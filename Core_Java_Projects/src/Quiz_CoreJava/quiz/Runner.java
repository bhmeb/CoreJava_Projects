package Quiz_CoreJava.quiz;

public class Runner {

	public static void main(String[] args) {
		
		Quiz obj=new Quiz();
		obj.initialize();
		obj.SetQuestion();
		obj.SetOption();
		obj.SetAnswar();
		obj.run();
		obj.result();
	}
}
