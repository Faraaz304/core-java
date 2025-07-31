package collections_framework;
import java.util.ArrayList;
import java.util.List;
public class ArrayList_functions {
	public static void main(String args[]) {
		List<String> list = new ArrayList<>();
		list.add("apple");
		list.add("mango");
		list.add("banana");
		list.add("orange");
		System.out.println("list is "+ list);
		System.out.println(list.get(2));
		list.set(0, "chicko");
		System.out.println("list is "+ list);
        System.out.println(list.size());		
        System.out.println(list.indexOf("mango"));		
        System.out.println(list.lastIndexOf("orange"));	
        list.remove(0);
        // 9. equals()
        List<String> otherList = new ArrayList<>();
        otherList.add("Orange");
        otherList.add("Banana");
		System.out.println(list.equals(otherList));
		list.clear();
		System.out.println(list.isEmpty());


	}
}
