package com.form.bean;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class Employee {
	
	
	private Integer id;	
	private String name;	
	private List<MultipartFile> image;
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
	public List<MultipartFile> getImage() {
		return image;
	}
	public void setImage(List<MultipartFile> image) {
		this.image = image;
	}
	

}
