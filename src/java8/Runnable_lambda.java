package java8;

//class Myrunnable implements Runnable{
//	public void run() {
//		for(int i =0;i<10;i++) {
//			System.out.println("child thread");
//		}
//	}
//}


public class Runnable_lambda {
	public static void main(String[] args) {
//		Myrunnable r = new Myrunnable();
		Runnable r = ()->{
			for(int i=0;i<10;i++) {
				System.out.println("child thread");  //same outuput with runnable
			}
		}; // semicolon here
		Thread t = new Thread(r);
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("parent thread");
		}
		
	}

}
