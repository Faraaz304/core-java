package collections_framework;
import java.util.*;
public class Queue_data_structure {
     public static void main(String[] args) {
    	 Queue<String> q = new LinkedList<>();
//    	 q.add("abc");
    	 Scanner in = new Scanner(System.in);
    	 System.out.println("enter length");
    	 int n = in.nextInt();
    	 for(int i =0;i<n;i++) {
    		 q.add(""+6i);
    	 }
    	 
    	 
    	 System.out.println(q);
		
	}
}
