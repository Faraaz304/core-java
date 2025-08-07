package java8;
import java.util.Arrays;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.*;
public class Trail {
    public static void main(String[] args) {
		List<String> list = Arrays.asList("abc" ,"pqr" ,"xyz");
		ArrayList<String> list1 = new  ArrayList<>();
		list1.add("abc");		
		list1.add("pqr");
		list1.add("abc==");
		list1.add("bef");
		list1.add("ahvnbvvj");
		list1.add("jbgryd");
		list1.add("ltjgjf");
		list1.add("egffhfu46");

//		list.forEach(c1 -> System.out.println());
		
		List<String> filtered = list1.stream().filter(name -> name.startsWith("a"))
				.filter(name -> name.length()>3)
				.map(String::toUpperCase)
				.collect(Collectors.toList());
		filtered.forEach(System.out::println);
	}
}
