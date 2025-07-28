package fundamentals;

public class Arrays {
	public static void main(String args[]) {
		int a[] = new int[] {10,20,30};
		System.out.println(sum(a));
	}
	public static int sum(int x[]) {
		int total =0;
		for(int i :x) {
			total +=i;
		}
		return total;
		
	}

}
