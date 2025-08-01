package collections_framework;
import java.util.*;
public class Tree_demo2 {
	public static void main(String args[]) {
		

		Comparator<String> decend  = new Comparator<String>() {
			public int compare(String s1 ,String s2) {
				return s2.compareTo(s1);
			}
		};
		
		TreeSet<String> set = new TreeSet<String>(decend);
		set.add("abc");
		set.add("Pqr");
		set.add("xyZ");
		set.add("ASDg");
		set.add("obc");
		set.add("gtx");
		set.add("PLm");
		set.add("mcR");
		System.out.println(set);
		
		// for stirng buffer use custom function and convert into string and give
		

	}

}
