package Stream;

import java.util.Arrays;
import java.util.List;

import com.java8_v2.Person;

public class Unit1StreamExample {

	public static void main(String[] args) {
		
		List<Person> pList = Arrays.asList( 
				new Person("Jhons", "jawak", 40), 
				new Person("Michel", "jacpiter", 30),
				new Person("Harish", "Sen", 31));
		
		pList.stream()
		.filter(p -> p.getLastname().startsWith("S")) //It takes arg as predicate type
		.forEach(p -> System.out.println(p.getFirstname())); //It lakes arg as consumer
	}

}
