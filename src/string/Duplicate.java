package string;
import java.util.*;
public class Duplicate {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuffer result = new StringBuffer();
		String s = in.nextLine();
		
		
		HashMap<Character , Integer> map = new LinkedHashMap<>();
		for(char c:s.toCharArray()) {
			map.put(c,map.getOrDefault(c, 0)+1);
		}
		
		for(char c: map.keySet()) {
//			if(map.get(c) ==1) {
//				result.append(c);
//
//			}	
			result.append(c);
			
		}
		System.out.print(result);
		
		
	}

}
