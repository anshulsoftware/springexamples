package pack2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Student implements Comparable<Student>{  
	   int id;   
	   String name;   
	   public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	int age;
	   public Student(int id, String name, int age) {  
	      this.id = id;   
	      this.name = name; 
	      this.age = age;  
	   }
	@Override
	public int compareTo(Student o) {
		return name.compareTo(o.getName());
	} 
	}  
public class CollectorAverageExample {

	public static void main(String[] args) {
		 List<Student> studentlist = new ArrayList<Student>();  
	      //Adding Students  
	      studentlist.add(new Student(11,"Jon",22));   
	      studentlist.add(new Student(22,"Steve",18));   
	      studentlist.add(new Student(33,"Lucy",22));   
	      studentlist.add(new Student(44,"Sansa",23));   
	      studentlist.add(new Student(55,"Maggie",18));
	      //Getting the average Age 
	    /*  Double avgAge = studentlist.stream()   
	          .collect(Collectors.averagingInt(s->s.age));  
	      System.out.println("Average Age of Students is: "+avgAge);
		*/
	      List<Student> names = studentlist.stream().sorted().collect(Collectors.toList());
	      //List<Student> names = studentlist.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());		     	      
	     // names.forEach(e->System.out.println(e.id+" "+e.name+" "+e.age));
	      for(Student s:names)
	      {
	    	System.out.println(s.id+" "+s.name+" "+s.age);  
	      }
	}

}
