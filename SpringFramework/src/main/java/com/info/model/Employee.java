package com.info.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
public class Employee
{
	@NotNull(message="Enter Id")
	private Integer id;
	@NotEmpty(message="Enter Name")
	private String name;	
	private Integer salary;	
	private String designation;
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	
}
