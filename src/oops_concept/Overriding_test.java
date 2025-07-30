package oops_concept;



class Animal{
	public void sound() {
		System.out.println("animal sound");
	}
}

class Dog extends Animal{
	public void sound() {
		System.out.println("Dog sound");
	}
}


public class Overriding_test {
	public static void main(String args[]) {
		Animal ob = new Animal();
		ob.sound();
		Animal a  = new Dog();    // parent reference  child object
		a.sound();
	}
	

}
