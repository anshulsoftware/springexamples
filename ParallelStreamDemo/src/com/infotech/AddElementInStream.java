package com.infotech;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student1
{
	private String name;
	private String city;
	public Student1(String name, String city) {
		this.name = name;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	
	public String getCity() {
		return city;
	}
	@Override
	public String toString() {
		return "Student1 [name=" + name + ", city=" + city + "]";
	}
	
}
public class AddElementInStream {

	public static <T> List<T> remove(List<T> list, Predicate<T> predicate)
	{
		//predicate.t
		return list.stream()
					.filter(x -> !predicate.test(x))
					.collect(Collectors.toList());
	}
	public static <T> List<T> remove1(List<T> list, Predicate<T> predicate1)
	{
		//predicate.t
		return list.stream()
					.filter(x -> !predicate1.test(x))
					.collect(Collectors.toList());
	}
	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		Predicate<String> predicate= a -> (a == "C");
		list = AddElementInStream.remove(list,predicate);
	   // list.forEach(System.out::println);
		
		list.stream().forEach(System.out::println);
		//Iterator it = list.stream().iterator();
		List<Student1> student=Stream.of(new Student1("Aman","Moradabad"),new Student1("Vijay","Meerut"))
				.collect(Collectors.toList());
		Predicate<Student1> predicate1 = b->(b.getName() == "Vijay");
		student= AddElementInStream.remove1(student,predicate1);
		student.forEach(System.out::println);
	}

}
