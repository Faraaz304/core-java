package fundamentals;

public class Local_variable {
	public static void main(String args[]) {
		int x =5 ;
		if(args.length >0){
			x =10;
		}else {
			x =20;
		}
		System.out.println(x);
	}

}
