package collections_framework;
import java.util.*;
public class Tree_pactise {
     public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
//		set.add(5);
//		set.add(10);
//		set.add(6);
//		set.add(0);
//		set.add(9);
//		set.add(23);
        Scanner in = new Scanner(System.in);
        System.out.println("enter lenght  and nubers");
        int n = in.nextInt();
		for(int i =0;i<n;i++) {
			set.add(in.nextInt());
		}
		System.out.println(set);
	}
}
