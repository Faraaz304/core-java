package collections_framework;
//import java.util.LinkedList;
import java.util.*;
public class ListIterator_practise {
     public static void main(String args[]) {
    	 LinkedList l = new LinkedList();
    	 l.add("abc");
    	 l.add("pqr");
    	 l.add("xyz");
    	 ListIterator itr = l.listIterator();
    	 while(itr.hasNext()) {
    		 String  s = (String)itr.next();
    		 if(s.equals("xyz")) itr.remove();
    		 else if (s.equals("pqr")) itr.add("ghi");
    		 else itr.add(" nothing");
    	 }
    	 System.out.print(l);
    	 

     }
}
