package com.form.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.form.bean.Employee;
import com.form.bean.Images;
import com.form.service.EmployeeService;

@Controller
public class EmpController
{
	@Autowired
	EmployeeService employeeservice;
	@RequestMapping(value="/send" ,method=RequestMethod.GET)
	public String empForm(Model m)
	{
		m.addAttribute("employee", new Employee());
		return "empform";
		
	}
	@RequestMapping(value="/save", params="saveImage" ,method=RequestMethod.POST)
	public String empSaveImage(@ModelAttribute("employee") Employee employee,Model m,HttpServletRequest request)
	{
		int n=employeeservice.save(employee, request);
		m.addAttribute("msg", "Insert Image with Id :"+" "+n);
		return "empform";
	}
  @RequestMapping(value="/save",params="getImage",method=RequestMethod.POST)
  public String getImage(@ModelAttribute("employee") Employee emp,Model m) throws IOException
  {
	  //System.out.println("IN Controller "+emp.getId());
	  Images employee= employeeservice.getEmpById(emp.getId());
	
	 m.addAttribute("id", employee.getId());
	 m.addAttribute("name", employee.getName());
	 m.addAttribute("image", employee.getImgpath());
	
	
       
	 return "welcome";
  }

}
