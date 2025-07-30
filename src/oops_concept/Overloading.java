package oops_concept;

public class Overloading {
	public void method() {
		System.out.println("no argument provided");
	}
    public void method(int a) {
		System.out.println("argument provided integer " +a);
		
	} 
    public void method(String a) {
		System.out.println("argument provided String  " +a);

    }
    public void method(double a ,int b) {
		System.out.println("argument provided double and int " +a + b);

    }
    public void method(StringBuffer s) {
		System.out.println("argument provided String buffer " +s);

    }
    public static void main(String args[]) {
    	Overloading t = new Overloading();
    	t.method();
    	t.method(8);
    	t.method(8.67 ,5);
    	t.method("hello");
    	t.method('a');   // int argument called 
    	t.method(new StringBuffer("hello"));
//    	t.method(null);


    }

}
