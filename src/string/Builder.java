package string;

public class Builder {
    public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		 System.out.println(sb.append("hello"));    
		 System.out.println(sb.insert(3, "hi"));  
		System.out.println(sb.replace(0, 5, "Hi"));  
		System.out.println(sb.reverse());  

	}
}
