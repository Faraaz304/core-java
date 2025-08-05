package mutithreading;


class A extends Thread{
	public void run() {     // run should be there not a keyword but used in tread class
		try {
			for(int i =0;i<7;i++) {
				System.out.println("First ");
				Thread.sleep(1000);
			}
		}
		catch (InterruptedException e){
			System.out.println("Thread is dead!!!!!!!");
		}
	}
}


class B extends Thread{
	public void run() {     // run should be there not a keyword but used in tread class
		try {
			for(int i =0;i<7;i++) {
				System.out.println("Second ");
				Thread.sleep(1000);
			}
		}
		catch (InterruptedException e){
			System.out.println("Thread is dead!!!!!!!");
		}
	}
}


class C extends Thread{
	public void run() {     // run should be there not a keyword but used in tread class
		try {
			for(int i =0;i<7;i++) {
				System.out.println("third ");
				Thread.sleep(1000);
			}
		}
		catch (InterruptedException e){
			System.out.println("Thread is dead!!!!!!!");
		}
	}
}





public class DemoThread {
	public static void main(String[] args)  throws InterruptedException{
		A t1 = new A();
		B t2 = new B();
		C t3 = new C();
//		System.out.println(t1.isAlive());
		t1.start();
		t2.start();
		t3.start();
		t3.setPriority(Thread.MAX_PRIORITY);
		t1.interrupt();
		t1.join();  // until thread completes its task no one can execute
		System.out.println(t1.isAlive());
		System.out.println(t3.getPriority());

		
		
		
	}

}
