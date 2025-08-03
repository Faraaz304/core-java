package collections_framework;
import java.util.*;
public class HashMapPrac {
	
	 public static void fun1(String nums[]) {
		 HashMap<String , Integer> map = new HashMap<>();
			
			for(String s :nums) {
			   map.put(s,map.getOrDefault(s, 0)+1);
			}
			
			for(String  i :map.keySet()) {
				System.out.println(i +": " +map.get(i));
			}
			
	 }
     public static void main(String[] args) {
    	 Scanner in = new Scanner(System.in);
    	 System.out.println("enter length");
    	 int  n = in.nextInt();
//    	 in.nextLine();
    	 String str[] =new String[n];
    	 System.out.println("enter elements");

    	 for(int i =0;i<n;i++) {
    		 str[i] =in.next();
    	 }
    	 fun1(str);
//    	 in.close();
		
	}
}
