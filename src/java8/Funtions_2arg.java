package java8;
import java.util.function.*;
public class Funtions_2arg {
      public static void main(String[] args) {
		BiPredicate<Integer,Integer> p1 = (x,y) ->{
			return (x+y)%2 ==0;
		};
		BiFunction<String ,String ,Integer> f1 =(x,y) ->{
			return  x.length()+y.length(); 
		};
		
		BiConsumer<String ,String > c1 =(x,y) ->{
			System.out.println(x.concat(y));
		};
		
		
		System.out.println(p1.test(7, 9));
		System.out.println(f1.apply("hello", "abc"));
		System.out.println();
		c1.accept("hello", "abc");


	}
      
}
