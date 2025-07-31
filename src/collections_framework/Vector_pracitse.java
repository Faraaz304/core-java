package collections_framework;
import java.util.Vector;
public class Vector_pracitse {
    public static void main(String args[]) {
//    	Vector<String> v = new Vector<>();
//    	v.addElement("bus");
//    	v.addElement("car");
//    	v.addElement("cycle");
//    	v.addElement("airplane");
//    	v.insertElementAt("train" ,1);
//    	v.setElementAt("ship" ,3);
//    	System.out.println(v);
//    	v.remove(2);
//    	System.out.println(v.size());
    	
    	Vector v = new Vector<>();
    	System.out.println(v.capacity());
    	for(int i =1;i<=10;i++) {
    		v.add(i);
    	}
    	System.out.println(v.capacity());
        v.add("hello");
    	System.out.println(v.capacity());  //sida double capacity


    	
    }
}
