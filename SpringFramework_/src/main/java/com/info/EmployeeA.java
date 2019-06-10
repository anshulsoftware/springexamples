package com.info;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class EmployeeA 
{
	@Size(min=2,message="Length minimum two character")
	@NotNull
	private String firstName;
	@Size(min=2,message="Length minimum two character")
	@NotNull
	private String lastName;
	@Size(message="Plese select any one")
	@NotNull
	private String gender;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

}
