package java8;
import java.util.*;
import java.util.function.*;
public class Predicate_testing {
	public static void main(String[] args) {
		Predicate<String> p1 =s -> s.length()>=3;
		String arr[] = {"hello" ,"this ","is" ,"fun","learning"};
		ArrayList<String> list   = new ArrayList<>(Arrays.asList(arr));
		for(String s :list) {
			if(p1.test(s)) System.out.println(s);
		}
	}

}
