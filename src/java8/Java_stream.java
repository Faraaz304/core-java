package java8;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
public class Java_stream {
   public static void main(String[] args) {
	   List<Integer> numbers = Arrays.asList(5, 2, 8, 2, 5, 10, 8, 3);
	   List<Integer> scores = Arrays.asList(95, 87, 76, 92, 99, 64, 88, 91, 77);

	   
//	   List<Integer> filtered = numbers.stream()
//			   .distinct().collect(Collectors.toList());
	   
	   
	   List<Integer> filtered  =scores.stream().sorted(Comparator.reverseOrder())
			   .skip(3)
			   .limit(3)
			   .collect(Collectors.toList());
			   
	   
	   
	   
	   filtered.forEach(System.out::println);

}
}
