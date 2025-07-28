package fundamentals;

public class Var_arg_method {
	public static void sum(int... x) {
//		System.out.println("variable line argument " + x.length);
		int total =0;
		for( int i :x) {
			total += i;
		}
		System.out.println(total);
//		return total;
	}
	public static void main(String args[]) {
		sum(10,50);
		int a[] = {10,20,30};
		int b[] = {80,60,30};
		var_arr(a,b);
	}
	
	public static void var_arr(int[]... x) {
		for(int[] i :x) {
			System.out.println(i[0]);
		}
	}

}
