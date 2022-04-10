package Quiz_CoreJava.quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz {
	String question, answer, options;
	char ch;
	int i, correct = 0;
	Quiz[] quiz = new Quiz[10];

	public void initialize() {
		for (int i = 0; i < 10; i++) {
			quiz[i] = new Quiz();
		}
	}

	public void SetQuestion() {
		quiz[0].question = "Who Developed Java?";
		quiz[1].question = "Which one is input device?";
		quiz[2].question = "What is the full form of JDK?";
		quiz[3].question = "What is an class in Java?";
		quiz[4].question = "What is Abstraction in Java?";
		quiz[5].question = "What is Encapsulation in Java?";
		quiz[6].question = "What is an Method?";
		quiz[7].question = "What is the other name of Method?";
		quiz[8].question = "What is an Object?";
		quiz[9].question = "What is Message Passing?";
	}

	public void SetOption() {
		quiz[0].options = "A: Charles Babbage\nB: Lady Ada Lovelace\nC: Tim Berners-Lee\nD: James Gosling";
		quiz[1].options = "A: C++\nB: Groovey\nC: Oak\nD: HTML";
		quiz[2].options = "A: Java Developing Kit\nB: Java Development Kit\nC: Java Developed Kit\nD: Java Disk Kit";
		quiz[3].options = "A: It is an representation of a set of objects\nB: It is nothing more than a keyword\nC: An identifiable entity with some characteristics and behaviour\nD: Datatype";
		quiz[4].options = "A: Representation for the specific behaviour of an object\nB: Wrapping up of data into a single unit\nC: Type of an Java Program\nD: Act of Representing essential features only without any background details";
		quiz[5].options = "A: Wrapping up of data into a single unit\nB: Keyword\nC: Use to declaire an Object\nD: One of the Characteristics of Java";
		quiz[6].options = "A: The number and types of Arguments\nB: Collection of similar datatype\nC: A sequence of statements that carry out specific task(s)\nD: Throwable Exception";
		quiz[7].options = "A: Function\nB: Array\nC: Exception\nD: Class";
		quiz[8].options = "A: Blue print of an Program\nB: Identifiable entity with some Characteristics and Behaviour\nC: Visibility mode of an Java statement\nD: Type of a Stream used in Java";
		quiz[9].options = "A: A way of sending/receiving information to/from another class\nB: A way of sending/receiving information to/from another package\nC: A way of sending/receiving information to/from another instance of class\nD: A way to implement data abstraction in Java";
	}

	public void SetAnswar() {
		quiz[0].answer = "D";
		quiz[1].answer = "C";
		quiz[2].answer = "B";
		quiz[3].answer = "A";
		quiz[4].answer = "D";
		quiz[5].answer = "A";
		quiz[6].answer = "C";
		quiz[7].answer = "A";
		quiz[8].answer = "B";
		quiz[9].answer = "C";
	}

	public void run() {

		try {
			Scanner sc = new Scanner(System.in);
			String input = "";
			for (int i = 0; i < 10; i++) {
				System.out.println(
						"Question: " + (i + 1) + ": " + quiz[i].question + "\nYour Options:-\n " + quiz[i].options);
				System.out.println("Which one is correct: ");
				input = sc.next();
				System.out.println("\n\n");
				if (input.equalsIgnoreCase(quiz[i].answer)) {
					System.out.println("Correct");
					correct++;
				} else {
					System.out.println("Incorrect");
				}

				System.out.println("Correct Anawer is: " + quiz[i].answer);
				System.out.println("\n\n");
				//sc.close();
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Error Occur!\n" + e.getMessage());
			System.exit(0);
		} catch (InputMismatchException e) {
			System.err.println("Error Occur!\n" + e.getMessage());
			System.exit(0);
		}
	}

	public void result() {
		System.out.println("Your score below");
		System.out.println("You have scored " + correct + " out of 10 and incorrect " + (10 - correct));

		if (correct <= 4) {
			System.out.println("Better luck next time");
		} else if (correct <= 5 && correct > 7) {
			System.out.println("You played nice. But more affort is needed!");
		} else if (correct <= 7 && correct > 9) {
			System.out.println("You did a great job!");
		} else if (correct == 20)
			System.out.println("You did a Marvelous job!");
	}
}
