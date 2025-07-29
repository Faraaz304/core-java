package pack1;

public class Base {
	public void method1() {
		System.out.println("i am from base");
	}

	
	public static void main(String args[]) {    // defualt can be access in same package not outside package
		Base ob = new Base();
		ob.method1();
	}
}
