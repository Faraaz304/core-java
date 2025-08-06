package java8;


interface intref{
	int square(int n);
}
interface interf1{
	String greet(String name);      // for multiple methods different interface
}

public class Lambda3 {
	public static void main(String[] args) {
		intref sq = n ->n*n ;
		interf1 nm = name -> " hello " +name;
		
	    System.out.println(sq.square(7));	
	    System.out.println(nm.greet("faraaz"));	

	}

}
