package oops_concept;

public abstract class Vehicle {
	public abstract int getNoOfWheels();
}
class Bus{
	public int getNoOfWheels() {
		  return 6;
	  }
}
class Auto{
	public int getNoOfWheels() {
		  return 3;
	  }	
}
class Bike{
	public int getNoOfWheels() {
		  return 2;
	  }
}
class Calling{
	public static void main(String args[]) {
		Bus b1 = new Bus();
		Auto a1 = new Auto();
		Bike  b2 = new Bike();
		System.out.println(b1.getNoOfWheels());
		System.out.println(b2.getNoOfWheels());
		System.out.println(a1.getNoOfWheels());

	} 
}


