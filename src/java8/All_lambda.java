package java8;
import java.util.function.*;
public class All_lambda {
     public static void main(String[] args) {
		
    	 // predicate
    	 Predicate<Integer> iseven = num -> num%2 ==0;   //for boolean operation 
    	 // funtion
    	 Function<String ,Integer> getLength = s-> s.length(); // for transformation 
    	 // cosumer 
    	 // supplier 
    	 
    	 System.out.println("using predicate" +iseven.test(8));
    	 System.out.println("using funtion" +getLength.apply("hello"));

    	 
    	 
	}
}
