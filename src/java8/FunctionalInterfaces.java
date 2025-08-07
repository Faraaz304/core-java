package java8;
import java.util.function.*;
import java.util.*;

class Student{
	String name;
	int marks;
	Student(String name ,int marks){
		this.name =name;
		this.marks =marks;
	}
}
public class FunctionalInterfaces {
	
	
	public static void main(String[] args) {
		Function<Student ,String> gradingSystem = s -> {
			String grade ="";
			int marks = s.marks;
			if(marks >80) grade ="A";
			else if(marks >60) grade ="B";
			else if(marks >40) grade ="C";
			else  grade ="Failed";
			return grade;
		};
		
		
		Consumer<Student> c = s->{
			System.out.println("name  is "+ s.name);
			System.out.println("marks is "+ s.marks);
			System.out.println("grade is "+ gradingSystem.apply(s));
			System.out.println();
			
		};
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("abc" ,67));
		list.add(new Student("pqr" ,29));
		list.add(new Student("zzz" ,79));
		list.add(new Student("lmn" ,58));
		list.add(new Student("jkl" ,93));
		
		for(Student s :list) {
			c.accept(s);
		}
		
	}

}
