package com.infotech;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8WithStream {

	public static void main(String[] args) {
		List<Employee> list=new ArrayList<>();
		list.add(new Employee(1,"Aman",12000));
		list.add(new Employee(2,"Vijay",13000));
		list.add(new Employee(3,"Ramesh",14000));
		//List<String> li=list.stream().map(e->e.getName().toUpperCase()).collect(Collectors.toList());
		List<Employee> li=Stream.of(new Employee(2,"Vijay",13000),new Employee(1,"Aman",12000),new Employee(3,"Ramesh",14000)).sorted().collect(Collectors.toList());

		/*li.sort(new Comparator<Employee>() {
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareTo(o2.getName());
			};
		});*/
		//li.forEach(System.out::println);
		//List<Employee> emp=list.stream().collect(Collectors.toList());
		
		li.forEach(a->System.out.println(a.getName().toUpperCase()+" "+a.getSalary()));
		
	}

}
class Employee implements Comparable<Employee>
{
	private int id;
	private String name;
	private double salary;
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	/*@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}*/
	@Override
	public int compareTo(Employee e1) {
		return this.getName().compareTo(e1.getName());
	}
	
	
}