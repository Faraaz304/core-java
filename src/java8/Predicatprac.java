package java8;
import java.util.function.Predicate;
public class Predicatprac {
	public static void main(String[] args) {
		Predicate <Integer> iseven  = num -> num%2 ==0;
		System.out.println(iseven.test(8));
		System.out.println(iseven.test(5));

	}

}
