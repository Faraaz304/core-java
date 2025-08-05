package mutithreading;

class Bus extends Thread{
	int availble =3,passenger;
	Bus(int passenger){
		this.passenger = passenger;
	
	}
	public synchronized void run() {
		
		if(availble >=passenger) {
			System.out.println("seat got to" +Thread.currentThread().getName());
			availble -= passenger;
		}else {
			System.out.println("sorry no seat avalible");
		}	
	}
}


public class Bus_reservation {
	public static void main(String[] args) {
		Bus ob1 = new Bus(2);
		Bus ob2 = new Bus(10);
		Bus ob3 = new Bus(6);

		ob1.start();
		ob2.start();
		ob3.start();
		
		
	}

}
