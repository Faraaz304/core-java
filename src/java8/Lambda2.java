package java8;
import java.util.*;
public class Lambda2 {
	public static void main(String[] args) {
		HashMap<String , Integer> map = new HashMap<>();
		List<String> list = Arrays.asList("hello" ,"hi" ,"abc" ,"zzzz");
		List<String> list2 = Arrays.asList("psre" ,"ooo" ,"**" ,"__okm");

		map.put("abc", 1);
		map.put("pqr", 3);
		map.put("xyz", 7);
		map.put("jkl", 9);
		
		
		//using lambda  for hashmap
//		map.forEach((key ,value) -> System.out.println("key "+key +" value "+value));
		
		//using lambda for sorting list
		Collections.sort( list , (a,b) -> a.compareTo(b));
		System.out.println(list);
		
	}

}
