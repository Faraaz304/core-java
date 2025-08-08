package java8;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
class Person{
	int age;
	String name;
	Person(String name,int age ){
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
		
		List<String> filtered = people.stream().filter(x->x.name.startsWith("R"))
				.filter(x->x.age >=25).map(x-> {
					return x.name +" is " +x.age+" years old ";
				}).collect(Collectors.toList());
		filtered.forEach(System.out::println);

	}
	

}
