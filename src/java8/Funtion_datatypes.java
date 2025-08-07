package java8;
import  java.util.function.*;
public class Funtion_datatypes {
	public static void main(String[] args) {
		Function<Integer ,Double> convert = i -> Math.sqrt(i);
		System.out.print(convert.apply(7));
	}

}
