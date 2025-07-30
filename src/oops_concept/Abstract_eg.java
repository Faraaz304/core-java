package oops_concept;


abstract class Animal{
	public abstract void sound();
	public void sleep() {
		System.out.println("sleeping");
	}
}

class Dog extends Animal{
	public void sound() {
		System.out.println("dog sound");
	}
}

public class Abstract_eg {
	public static void main(String args[]) {
		Animal a = new Dog();
		a.sound();
		a.sleep();
		
	}

}
