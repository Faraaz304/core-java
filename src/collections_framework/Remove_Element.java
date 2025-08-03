package collections_framework;
import java.util.*;
public class Remove_Element {
      public static void main(String[] args) {
    	  Scanner in =new Scanner(System.in);
    	  ArrayList<Integer> list = new ArrayList<>();
		  System.out.println("enter length");
		  int n = in.nextInt();
    	  for(int i =0;i<n;i++) {
    		  System.out.println("enter element");
    		  list.add(in.nextInt());
    	  }
		  System.out.println("enter element to remove");
		  int rem = in.nextInt();
		  
		  if(list.contains(rem)) {
			  list.remove(rem);
		  }
		  System.out.println(list);
		  

   }
}
