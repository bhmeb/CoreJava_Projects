package PredicateExmple;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Unit1PredicateExample {

	public static void main(String[] args) {

		List<Person> pList = Arrays.asList( // Inline arrays
				new Person("Jhons", "jawak", 40), 
				new Person("Michel", "jacpiter", 30),
				new Person("Harish", "Sen", 31));

		Collections.sort(pList, ( o1, o2 ) ->  o1.getLastname().compareTo(o2.getLastname()));

		printConditionaly(pList, p -> true);

		System.out.println("print person last name start with j");
		printConditionaly(pList, (Person p) -> p.getLastname().startsWith("j"));
		System.out.println("print person first name start with H");
		printConditionaly(pList, (Person p) -> p.getFirstname().startsWith("H"));
	}

	private static void printConditionaly(List<Person> pList, Predicate<Person> predicate) {
		for (Person p : pList) {
			if (predicate.test(p)) {
				System.out.println(p);
				System.out.println(p);
			}
		}
	}
}
