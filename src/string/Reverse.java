package string;

import java.util.Scanner;

public class Reverse {
	
	public static String reverse(String s) {
		int start = 0;
		int end =s.length()-1;
		char str[] =s.toCharArray();
		while(start <end) {
			char temp = str[start];
			str[start] = str[end];
			str[end] = temp;
			start++;
			end--;
		}
		return new String(str);
	}
	
	public static String r1(String s) {
		return new StringBuilder(s).reverse().toString();
	}
	
	
	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		String s = in.next();
//	    String s1 =	reverse(s);
		String s1  =r1(s);
	    System.out.print(s1);
	    
		
	}

}
