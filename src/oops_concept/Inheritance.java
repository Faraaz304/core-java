package oops_concept;

public class Inheritance {
	public static void main(String args[]) {
		First ob = new First();
//		ob.m1();
//		ob.m2();   parent reference cannot call 
		Second ob1 = new Second();
		ob1.m1();
		ob1.m2();
	}
}
class  First{
	public void m1() {
		System.out.println("fist class");
	}
	
}
class Second extends First{
	public void m2() {
		System.out.println("second class");
	}
}
