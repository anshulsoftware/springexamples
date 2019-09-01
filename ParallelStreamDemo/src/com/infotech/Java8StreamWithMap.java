package com.infotech;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class Java8StreamWithMap {

	public static void main(String[] args) {
		/*Map<Integer,Employee1> map=new HashMap<>();
		map.put(1, new Employee1(1,"Aman",12000));
		map.put(2, new Employee1(2,"Vijay",13000));
		map.put(3, new Employee1(3,"Ramesh",14000));*/
		List<Employee1> list=new ArrayList<>();
		list.add(new Employee1(1,"Aman",12000));
		list.add(new Employee1(2,"Vijay",13000));
		list.add(new Employee1(3,"Ramesh",14000));		
		/*Map<Integer,String> empMap = list.stream().collect(Collectors.toMap(p->p.getId(), p->p.getName()));
		System.out.println(empMap);*/
		Map<Integer,Employee1> emp=list.stream()
		.collect(Collectors.toMap(p->p.getId(),p->p));
		emp.forEach((k,v)->System.out.println(k+" "+v.getName()+" "+v.getSalary()));
		//how to insert Employee object in map
		/*for(Map.Entry m:emp.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}*/
		//System.out.println(emp);
	}
}
class Employee1
{
	private int id;
	private String name;
	private double salary;
	public Employee1(int id, String name, double salary) {
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
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}