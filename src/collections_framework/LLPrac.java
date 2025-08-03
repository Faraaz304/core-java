package collections_framework;
import java.util.*;
import java.util.Scanner;

public class LLPrac {
	 public static void main(String[] args) {
		 LinkedList<Integer> list = new LinkedList<>();
    	 Scanner in = new Scanner(System.in);
    	 System.out.println("enter length");
    	 int  n = in.nextInt();
//    	 String str[] =new String[n];
    	 
    	 System.out.println("enter elements");

    	 for(int i =0;i<n;i++) {
    		 list.add(in.nextInt());
    	 }
    	 System.out.println("enter element  to remove");
    	 int x = in.nextInt();
    	 list.removeFirstOccurrence(x);
    	 System.out.println(list);


	 }
}
