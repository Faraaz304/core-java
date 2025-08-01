package collections_framework;

public class Method {
	
	public int sum(int a ,int b) {
	    return  a+b;
	}
	public int sum(int a ,int b ,int c) {
		return a+b+c;
	}
	
	public static void main(String[] args) {
		Method obj = new Method();
		System.out.println(obj.sum(2, 7));
		System.out.println(obj.sum(3, 6, 8));
		
	}
	
	
	
	
	
	

}
