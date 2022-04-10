package Quiz_CoreJava.quiz2;

import java.util.Scanner;

public class Quiz {

	String question, answer, option;
	int id;

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	int correct = 0;
	Quiz[] quiz = new Quiz[10];

	public void initialise() {

		for (int i = 0; i < 10; i++) {
			quiz[i] = new Quiz();

		}
	}

	public void SetQuestion() {

		quiz[0].id = 1;
		quiz[0].question = "Which one of thread-safe?";

		quiz[1].id = 2;
		quiz[1].question = "Which is not in Collection API?";

		quiz[2].id = 3;
		quiz[2].question = "Which one is better in tread-lock?";

		quiz[3].id = 4;
		quiz[3].question = "Which collection API is store key/value?";

		quiz[4].id = 5;
		quiz[4].question = "Defult method introduced in?";
	}

	public void SetOption() {
		quiz[0].option = "A: StringBuilder\n B: StringBuffer";
		quiz[1].option = "A: Set\n B: Map";
		quiz[2].option = "A: Synchronize\n B: Volatile";
		quiz[3].option = "A: Map\n B: List";
		quiz[4].option = "A: Java7\n B: Java8";
	}

	public void SetAnswer() {

		quiz[0].id = 1;
		quiz[0].answer = "B";

		quiz[1].id = 2;
		quiz[1].answer = "B";

		quiz[2].id = 3;
		quiz[2].answer = "B";

		quiz[3].id = 4;
		quiz[3].answer = "A";

		quiz[4].id = 5;
		quiz[4].answer = "A";
	}

	public void runner() {

		Scanner scan = new Scanner(System.in);
		String temp = "";

		for (int i = 0; i < 5; i++) {
			System.out.println("Question " + quiz[i].id + ": " + quiz[i].getQuestion() + "\nOptions:-\n"
					+ quiz[i].getOption());
			System.out.printf("Which one is correct: ");
			temp = scan.next();
			System.out.println("\n\n");
			if (temp.equalsIgnoreCase(quiz[i].answer)) {
				System.out.println("* * * Correct! * * *");
				correct++;
			} else {
				System.out.println("* * * Incorrect! * * *");
			}
		}
	}

	public void result() {
		System.out.println("Your Final Result:- ");
		System.out.println("You answered 5 questions out of which you answered " + correct + " correct and "
				+ (5 - correct) + " incorrect!");
		if (correct <= 1)
			System.out.println("Better Luck Next Time!");
		else if (correct <= 2 && correct > 3)
			System.out.println("You played nice. But more affort is needed!");
		else if (correct <= 3 && correct > 4)
			System.out.println("You did a great job!");
		else if (correct == 5)
			System.out.println("You did a Marvelous job!");
	}
}