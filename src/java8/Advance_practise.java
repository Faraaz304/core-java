package java8;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class Advance_practise {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Red", "Green", "Blue", "Yellow");
		List<String> names = Arrays.asList("Amit", "Raj", "Sneha", "Ravi", "Priya", "Ramesh", "Sara", "Rita");
		List<Integer> nums = Arrays.asList(10, 15, 22, 33, 42, 55, 60);

//		List<String> filter = list.stream().filter(x ->x.startsWith("g"))
//				.collect(Collectors.toList());
		
//		List<String> filter = names.stream().filter(x ->x.startsWith("r"))
//				.map(String::toUpperCase)
//				.collect(Collectors.toList());
		
//		List<String> filter = names.stream().map(x -> "Mr ."+ x)
//				.collect(Collectors.toList());
 		
//		List<Integer> filter = nums.stream().filter(x -> x%2==0)
//				.map(x->x*3)
//				.collect(Collectors.toList());
		
//		List<String> filter = names.stream().filter(x->x.startsWith("R"))
//				.map(x ->{
//					if(x.length()>4) 
//						return x +"  long Name";
//					else
//						return x +"  short Name";
//					
//				})
//				.collect(Collectors.toList());
		
		List<String> filter = list.stream()
				.collect(Collectors.joining("|"));
		
		filter.forEach(System.out::println);
		
//		
	}

}
