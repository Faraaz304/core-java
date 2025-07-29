package oops_concept;

public interface Intref {
	public void m1();  // note this is automatically abstract and public 
    void m2();         // same here
}
 class Service implements Intref{
	public static void main(String args[]) {
		
	}
	public void m1() {     // note for interface declare all the function or declare abstract if not       
		                   // complete
	}
	public void m2() {     // public keyword is compulsory here 
	}
}
