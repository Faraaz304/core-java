package oops_concept;

abstract class Test {
	public static void main(String args[]) {
		
	}
     public abstract void m1();
     public abstract void m2();
}
abstract class Subtest extends Test{
	public  void m1() {}
	
}
class Subsubtest extends Test{
	public void m2() {}
}
