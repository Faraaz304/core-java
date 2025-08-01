package collections_framework;
import java.util.*;
public class Treeset_sorted_set {
	public static void main(String args[]) {
//		SortedSet s = new SortedSet();
		TreeSet s =  new TreeSet();
		s.add("a");
		s.add("b");
		s.add("z");
		s.add("q");
		s.add("Q");
		s.add("b");
		s.add("b");
		s.add("b");
		s.add("b");  // repeted element only once considererd
		s.add("b");

//		s.add(null);     no null can be taken null pointer excetption
//	    null can be added only when tere is no elemetn present


		System.out.println(s);
	}

}
