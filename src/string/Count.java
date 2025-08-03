package string;

import java.util.Scanner;

public class Count {
	
	public static int count(String s) {
		int vov =0;
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c =='a'||c =='e'||c =='i'||c =='o'||c =='u') {
				vov++;
			}
		}
		return vov;
	}
	
	
	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		System.out.println("enter string");
		String s = in.next();
	    int s1 =	count(s);
	    System.out.print(s1);
		
	}

}
