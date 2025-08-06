package mutithreading;
import java.util.*;
import java.util.stream.*;
public class List_lambda {
   public static void main(String[] args) {
	ArrayList<Integer> list = new ArrayList<>();
	ArrayList<String> list2 = new ArrayList<>(Arrays.asList("hi","abc","pqr"));

	list.add(23);
	list.add(20);
	list.add(4);
	list.add(13);
	list.add(67);

	Collections.sort(list ,(a ,b) -> a-b);
//	System.out.println(list);

//	Collections.sort(list ,(a ,b) -> b-a);
//	System.out.println(list);

	Collections.sort(list2 ,(a ,b) ->a.compareTo(b));
//	System.out.println(list2);
	
	list.stream().forEach(System.out::println);
	
}
}
