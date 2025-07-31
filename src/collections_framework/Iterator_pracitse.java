package collections_framework;
import java.util.*;
public class Iterator_pracitse {
	public static void main(String args[]) {
		Vector<Integer> v = new Vector();
		for(int i =1;i<=10;i++) {
			v.addElement(i);
		}
		Iterator<Integer>  i = v.iterator();
			while(i.hasNext()) {
				Integer I = (Integer)i.next();
				if(I %2==0) {
					System.out.println(I);
				}else {
					i.remove();
				}
			}
		
		
		
	}

}
