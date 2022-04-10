package Java8.Predicate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit1PredicateAndConsumerExample {

	public static void main(String[] args) {

		List<Person> pList = Arrays.asList( // Inline arrays
				new Person("Jhons", "jawak", 40), 
				new Person("Michel", "jacpiter", 30),
				new Person("Harish", "Sen", 31));

		// step 1: sort list by last name

		Collections.sort(pList, ( o1, o2 ) ->  o1.getLastname().compareTo(o2.getLastname()));

		// step 2 : create a method that print all the element in the list
		performConditionaly(pList, p -> true, p->System.out.println(p));

		// step 3: create a method that print all person that last name start with 'S'

		System.out.println("print person last name start with j");
		performConditionaly(pList, (Person p) -> p.getLastname().startsWith("j"), p->System.out.println(p));
		System.out.println("print person first name start with H");
		//performConditionaly(pList, (Person p) -> p.getFirstname().startsWith("H"), p->System.out.println(p));
		performConditionaly(pList, (Person p) -> p.getFirstname().startsWith("H"), p->System.out.println(p.getFirstname()));

	}

	//Predicate has one method test()
	private static void performConditionaly(List<Person> pList, Predicate<Person> predicate, Consumer<Person> consumer) {
		for (Person p : pList) {
			if (predicate.test(p)) {
				consumer.accept(p);
			}
		}
	}
}
