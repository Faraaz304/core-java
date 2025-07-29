package pack1;

public class Testing_protected {
	protected void m1() {
		System.out.println("hi i am from m1 method in the parent class");
	}
	public static void main(String args[]) {
		
	}
}
//class Another_class extends Testing_protected {
//	public static void main(String args[]) {
//		Testing_protected ob1 = new Testing_protected();
//		Testing_protected.m1();
//		Another_class ob2 = new Another_class();
//		Another_class.m1();
//		Testing_protected a = new  Testing_protected();
//		Testing_protected.m1();
//		
//	}
//}