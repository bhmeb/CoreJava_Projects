package foreach_iterator;

import java.util.Arrays;
import java.util.List;

import com.java8_v2.Person;

public class CollectionIterationExample {

	public static void main(String[] args) {
		
		List<Person> pList = Arrays.asList( 
				new Person("Jhons", "jawak", 40), 
				new Person("Michel", "jacpiter", 30),
				new Person("Harish", "Sen", 31));
		
		System.out.println("Using for loop");
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i));
		}
		
		System.out.println("Using for in loop");
		for(Person p : pList) {
			System.out.println(p);
		}
		
		System.out.println("Using lambda foreach loop");
		pList.forEach(p -> System.out.println(p)); //ForEach method taking a consumer and it's lambda exp
		pList.forEach(System.out::println); //ForEach method taking a consumer and it's method ref
	}

}
