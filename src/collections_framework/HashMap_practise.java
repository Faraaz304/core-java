package collections_framework;
import java.util.*;
public class HashMap_practise {
     public static void main(String args[]) {
    	 HashMap<String ,Integer> map = new HashMap<>();
    	 map.put("abc" ,101);
    	 map.put("def" ,102);
    	 map.put("ghi" ,103);
    	 map.put("mno" ,104);
    	 map.put("jkl" ,105);
    	 map.put("xyz" ,106);
    	 map.put("pqr" ,107);
    	 System.out.println(map);
    	 Set s = map.keySet();
    	 System.out.println(s);

     }
}
