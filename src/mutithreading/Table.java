package mutithreading;


class Gettable extends Thread{
	int a;
	Gettable(int a){
		this.a=a;
	}
	
	
	public synchronized void run() {
		for(int i =1;i<=10;i++) {
			System.out.println(i*a);
		}
	}
}
public class Table {
	public static void main(String[] args) {
		Gettable ob = new Gettable(5);
		ob.start();
		Gettable ob2 = new Gettable(8);
		ob2.start();
//		ob.join();

		
	}

}
