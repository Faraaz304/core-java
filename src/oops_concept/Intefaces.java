package oops_concept;


interface E{
	void m1();
}
interface F {
	void m1();
}

class Completion implements E,F{
	public void m1() {
		System.out.println("method implemented m1");
	}
//	public void m1() {
//		System.out.println("method implemented m2");
//	}
}

public class Intefaces {
	public static void main(String args[]) {
		Completion ob = new Completion();
		ob.m1();
	}
    
}
