package java8;
import java.util.function.*;
public class Chaining_funtions {
	public static void main(String[] args) {
		Function<Integer ,Integer> f1 = i ->(3*i)/2;    //explicit typecasting
		Function<Integer ,Integer> f2 = i ->i*i*i;
		
		
       System.out.println(f1.andThen(f2).apply(6)); //f1 followed by f2
       System.out.println(f1.compose(f2).apply(6)); //f2 followed by f1

	}
}
