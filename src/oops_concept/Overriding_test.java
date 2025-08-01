package oops_concept;



class Parent{
	public void sound() {
		System.out.println("animal sound");
	}
}

class Child extends Parent{
	public void sound() {
		System.out.println("Dog sound");
	}
}


public class Overriding_test {
	public static void main(String args[]) {
	    Parent ob = new Parent();
		ob.sound();
		Child a  = new Child();    // parent reference  child object
		a.sound();
	}
	

}
