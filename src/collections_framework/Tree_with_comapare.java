package collections_framework;
import java.util.*;

class Mycomparator implements Comparator<Integer>{
	public int compare(Integer ob1,Integer ob2) {
		if(ob1 >ob2) {
			return -1;
		}else if(ob1< ob2) {
			return +1;
		}else{
			return 0;
		}
		
	}
}
public class Tree_with_comapare {
	public static void main(String args[]) {
		TreeSet s = new TreeSet(new Mycomparator());   //for default using compareto
		s.add(10);
		s.add(7);
		s.add(10);
		s.add(80);
		s.add(34);
		s.add(2);
		System.out.println(s);
	}

}
