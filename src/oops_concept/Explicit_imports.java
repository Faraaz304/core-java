package oops_concept;
import java.util.regex.*;
public class Explicit_imports {
	
	public static void main(String args[]) {
		String s = new String();
		StringBuffer sb = new StringBuffer();
		Thread t = new Thread();
		Exception e = new Exception();
		Student s1 = new Student();
		s1.m1();
		System.out.println("success");
		
//		 regex usage
		Pattern p = Pattern.compile("ab");
		System.out.print("pattern done");

		
		
	}


}
