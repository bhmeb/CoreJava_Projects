package MiniProject.V2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExampleSolutionJava7 {

	public static void main(String[] args) {

		List<Person> pList = Arrays.asList( // Inline arrays
				new Person("Jhons", "jawak", 40), new Person("Michel", "jacpiter", 30),
				new Person("Harish", "Sen", 31));

		// step 1: sort list by last name

		Collections.sort(pList, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastname().compareTo(o2.getLastname());
			}
		});

		// step 2 : create a method that print all the element in the list
		printAll(pList);

		// step 3: create a method that print all person that last name start with 'S'

		printLastNameBeginWithS(pList);

		printLastNameConditionaly(pList, new Condition() {

			@Override
			public boolean test(Person p) {
				return p.getLastname().startsWith("j");
			}
		});

		printLastNameConditionaly(pList, new Condition() {

			@Override
			public boolean test(Person p) {
				return p.getFirstname().startsWith("H");
			}
		});
	}

	// It's a flexible method. If we want to print start with D then we need to
	// create new method again.
	private static void printLastNameBeginWithS(List<Person> pList) {
		for (Person p : pList) {
			if (p.getLastname().startsWith("S")) {
				System.out.println();
				System.out.println(p);
			}
		}
	}

	//Conditionally print 
	private static void printLastNameConditionaly(List<Person> pList, Condition condition) {
		for (Person p : pList) {
			if (condition.test(p)) {
				System.out.println();
				System.out.println(p);
			}
		}
	}

	private static void printAll(List<Person> pList) {
		for (Person p : pList) {
			System.out.println(p);
		}
	}

	interface Condition {
		boolean test(Person p);
	}
}
