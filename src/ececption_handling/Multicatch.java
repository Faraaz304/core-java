package ececption_handling;

public class Multicatch {
	public static void main(String[] args) {
		int a  =10,b=0;
		try {
			System.out.println("divide is "+ a/b);
			String s = null;
			System.out.println(s.length());
		}
		catch(ArithmeticException |NullPointerException e){
			System.out.println("error caught");
		}
	}

}
