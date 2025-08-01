package collections_framework;
import java.util.HashSet;
import java.util.LinkedHashSet;
public class Hashset_practise {
	public static void main(String args[]) {
		HashSet s = new HashSet();
		s.add("hi");
		s.add("hi");
		s.add("a");
		s.add("b");
		s.add(null);
		s.add(null);
		System.out.println(s);   // no preserved order 
		
		// linked hashset 
		LinkedHashSet  s1 = new LinkedHashSet();
		s1.add("a");
		s1.add("b");
		s1.add("c");
		s1.add("d");
		s1.add("d");
		s1.add("c");
		s1.add("b");
		s1.add("a");
		s1.add(null);

		System.out.println(s1);   // order preserverd this is the difference


		
	}

}
