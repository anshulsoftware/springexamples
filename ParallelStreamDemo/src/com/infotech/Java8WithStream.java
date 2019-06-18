package com.infotech;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Java8WithStream {

	public static void main(String[] args) {
		List<Employee> list=new ArrayList<>();
		list.add(new Employee(1,"Aman",12000));
		list.add(new Employee(2,"Vijay",13000));
		list.add(new Employee(3,"Ramesh",14000));
		List<String> li=list.stream().map(e->e.getName().toUpperCase()).collect(Collectors.toList());
		li.forEach(System.out::println);
		List<Employee> emp=list.stream().collect(Collectors.toList());
		emp.forEach(a->System.out.println(a.getName()+" "+a.getSalary()));
	}

}
class Employee
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
	
	
}