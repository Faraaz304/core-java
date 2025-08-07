package java8;
//class Newone implements Runnable{
//	public void run() {
//		for(int i =0;i<10;i++) {
//			System.out.println("child thread");
//		}
//	}
//}

public class Runnablelambda {
	public static void main(String[] args) {
//		Newone ob = new Newone();
		Runnable r = () ->{
			for(int i =0;i<10;i++) {
				System.out.println("child  thread");
		}
			
		};
		Thread t = new Thread(r);
		
		t.start();
		
		for(int i =0;i<10;i++) {
				System.out.println("Main  thread");
		}
	}

}
