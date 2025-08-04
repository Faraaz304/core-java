package ececption_handling;

public class Multiple_cathch {
	public static void main(String[] args) {
		int arr[] = {10,20,30};
		int a =10;
		int b= 2;
		try {
			System.out.println("divsion  is" +a/b);
			System.out.println("fifth elemetn" + arr[5]);
		}
		catch(ArithmeticException e){
			System.out.println("sorry cannot divide");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("out of bound error ");
		}
		finally {
			System.out.println("this will alwasy execute");
		}
		
		
		
	}

}
