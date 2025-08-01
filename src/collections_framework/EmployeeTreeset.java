package collections_framework;
import java.util.*;

class Employee{
	int id;
	String name;
	Employee(int id ,String name){
		this.id = id;
		this.name = name;
	}
	public String toString() {
		return "Id "+id +" Name "+name;
	}
}

class EmployeeComparator implements Comparator<Employee>{
	public int compare(Employee e1 ,Employee e2) {
		return Integer.compare(e1.id, e2.id);
	}	
}



public class EmployeeTreeset {
	public static void main(String args[]) {
		TreeSet<Employee> set  = new TreeSet<Employee>(new EmployeeComparator());
		set.add(new Employee(107,"abc"));
		set.add(new Employee(103,"pqr"));
		set.add(new Employee(107,"abc"));
		set.add(new Employee(100,"xsd"));
		set.add(new Employee(102,"aty"));
		set.add(new Employee(106,"wer"));
		set.add(new Employee(107,"abc"));
		set.add(new Employee(101,"opi"));
//		System.out.println(set);
		for(Employee e :set ) {
			System.out.println(e);
		}
		

		
	}

}
