package Stream;

import java.util.Arrays;
import java.util.List;

import com.java8_v2.Person;

public class Unit1StreamExample2 {

	public static void main(String[] args) {
		
		List<Person> pList = Arrays.asList( 
				new Person("Jhons", "jawak", 40), 
				new Person("Michel", "jacpiter", 30),
				new Person("Harish", "Sen", 31),
				new Person("Manali", "Sen", 30));
		
		pList.stream()
		.filter(p -> p.getLastname().startsWith("S")) 
		.forEach(p -> System.out.println(p.getFirstname())); 
		
		long count = pList.stream()
		.filter(p -> p.getLastname().startsWith("S")) //it checks how many records matched with S
		.count();  //this is end of this chain
		
		System.out.println(count);
	}

}
