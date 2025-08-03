package string;
import java.util.*;
public class Frequency_words {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuffer sb = new StringBuffer(in.nextLine());
		String s =sb.toString().toLowerCase();
		String words[] =s.split(" ");
//		System.out.println(words[0]);
		
//		now calcuate freq
		HashMap<String , Integer> map = new HashMap<>();
		for(String word :words) {
			map.put(word,map.getOrDefault(word, 0)+1);
		}
		 map.forEach((key ,value) ->   System.out.println(key +" " +value));
	}

}
