package Java8.MethodReference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class MethodReferenceExample2 {
	public static void main(String[] args) {

		List<Person> pList = Arrays.asList( 
				new Person("Jhons", "jawak", 40), 
				new Person("Michel", "jacpiter", 30),
				new Person("Harish", "Sen", 31));

		System.out.println("Print all the persons");
		//performConditionaly(pList, p -> true, p->System.out.println(p));
		performConditionaly(pList, p -> true, System.out::println);  

	}
	
	private static void performConditionaly(List<Person> pList, Predicate<Person> predicate, Consumer<Person> consumer) {
		for (Person p : pList) {
			if (predicate.test(p)) {
				consumer.accept(p);
			}
		}
	}
}
