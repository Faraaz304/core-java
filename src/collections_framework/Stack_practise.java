package collections_framework;
import java.util.*;
public class Stack_practise {
     public static void main(String args[]) {
    	 Stack s = new Stack();
    	 s.push("faraaz");
    	 s.push("a");
    	 s.push("b");
    	 s.push("c");
    	 s.push("z");
    	 s.push("j");
    	 s.push("y");
//    	 s.push("faraaz");
    	 
    	 System.out.println(s);
    	 System.out.println(s.search("c"));
    	 System.out.println(s.peek());
    	 s.pop();
    	 s.pop();
    	 System.out.println(s.peek());
    	 System.out.println(s.search("bdfghdhf"));   // -1 for not found
    	 



     }
}
