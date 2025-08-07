package java8;
import java.util.*;
import java.util.function.*;
class Person{
	int age;
	String name;
	Person(int age ,String name){
		this.age =age;
		this.name = name;
	}
}

public class More_Advacne_pracitse {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
			    new Person("Amit", 22),
			    new Person("Ravi", 28),
			    new Person("Sneha", 19),
			    new Person("Ramesh", 35),
			    new Person("Pooja", 31),
			    new Person("Raj", 18),
			    new Person("Reena", 27)
			);
		
		people.forEach(System.out::println);

	}
	

}
