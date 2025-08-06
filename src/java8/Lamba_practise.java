package java8;
import java.util.*;

interface Calculator{
	int operate(int a ,int b);
}


public class Lamba_practise {
	
	public static void main(String[] args) {
		Calculator add =(a,b) -> a+b;
		System.out.println("addition is" +add.operate(8,7));
		Calculator multipy = (a,b) -> a*b;
		System.out.println("multicaion  is" + multipy.operate(8,7));
		
		
	}

}
