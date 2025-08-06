package java8;
import java.util.*;
import java.util.function.*;
class Employee{
	String name;
	int no;
	Employee(String name ,int no){
		this.name = name;
		this.no = no;
	}
	public String toString() {
		return name + ":" + no;	
	}
}


public class Employee_demo {
     public static void main(String[] args) {
    	 ArrayList<Employee> list =new ArrayList<>();
    	 Predicate<Employee>  p1 = i -> i.no>150;
    	 Predicate<Employee>  p2 = i -> i.no%2!=0;
         ArrayList<Employee> result = new ArrayList<>();
         
    	 list.add(new Employee("abc" ,195)); 
    	 list.add(new Employee("jkl" ,123)); 
    	 list.add(new Employee("mno" ,674)); 
    	 list.add(new Employee("pqr" ,237)); 
    	 list.add(new Employee("lmn" ,191)); 
    	 
    	 for(Employee e :list) {
    		 if(p1.and(p2).test(e)) {
    			 result.add(e);
    		 }
    	 }
    	 
//    	 System.out.print(list);
    	 Collections.sort(result ,(a,b) -> a.no-b.no);
//    	 System.out.println(list);
    	 System.out.println(result);

    	 
	
   }
}
