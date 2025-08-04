package ececption_handling;

public class Trycathch_eg {
	public static void main(String[] args) {
		int a =10,b=0;
		try {
			int result = a/b;
			System.out.println("division si "+result);
		}
		catch (ArithmeticException e){
			System.out.println("cannot divdie by zero");
		}
		System.out.println("done succesfully");
		
	}

}
