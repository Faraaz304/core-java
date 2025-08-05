package mutithreading;

public class Runnable_demo {
	
	
	static class A1 implements Runnable{
		public void run() {
			for(int i =0;i<5;i++) {
				System.out.println("class A");
			}
		}
		
	}
	
	static class B1 implements Runnable{
		public void run() {
			for(int i =0;i<5;i++) {
				System.out.println("class B");
			}
		}
		
	}
	
	
	static class C1 implements Runnable{
		public void run() {
			for(int i =0;i<5;i++) {
				System.out.println("class C");
			}
		}
	}
	
	
	
	public static void main(String[] args) {
//		Runnable_demo ob = new Runnable_demo();
		A1 ob1 = new A1();
		B1 ob2 = new B1();
		C1 ob3 = new C1();
		Thread t1 = new Thread(ob1);
		Thread t2 = new Thread(ob2);
		Thread t3 = new Thread(ob3);

		t1.start();
		t2.start();
		t3.start();

		
	}

}
