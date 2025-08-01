package collections_framework;
import java.util.*;


public class Hashtabledemo{
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>();

        table.put(101, "Java");
        table.put(102, "Python");
        table.put(103, "C++");

        System.out.println("Hashtable contents:");
        for (Map.Entry<Integer, String> entry : table.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
