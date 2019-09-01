package pack3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortList {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(1, "Mahesh", 12));
		list.add(new Student(2, "Suresh", 15));
		list.add(new Student(3, "Nilesh", 10));
		
		System.out.println("---Natural Sorting by Name---");
		List<Student> slist = list.stream().sorted().collect(Collectors.toList());
		slist.forEach(e -> System.out.println("Id:"+ e.getId()+", Name: "+e.getName()+", Age:"+e.getAge()));
		
		System.out.println("---Natural Sorting by Name in reverse order---");
		slist = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		slist.forEach(e -> System.out.println("Id:"+ e.getId()+", Name: "+e.getName()+", Age:"+e.getAge()));		
		
		System.out.println("---Sorting using Comparator by Age---");
		slist = list.stream().sorted(Comparator.comparing(Student::getAge)).collect(Collectors.toList());
		slist.forEach(e -> System.out.println("Id:"+ e.getId()+", Name: "+e.getName()+", Age:"+e.getAge()));
		
		System.out.println("---Sorting using Comparator by Age with reverse order---");
		slist = list.stream().sorted(Comparator.comparing(Student::getAge).reversed()).collect(Collectors.toList());
		slist.forEach(e -> System.out.println("Id:"+ e.getId()+", Name: "+e.getName()+", Age:"+e.getAge()));
	
		Collections.sort(list, new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				return s1.getAge().compareTo(s2.getAge());
			}
		});
	for(Student s : list){	
		System.out.println(s.getAge());
	}
	}
	
}
