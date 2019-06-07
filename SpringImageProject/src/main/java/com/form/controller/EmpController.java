package com.form.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.form.bean.Employee;
import com.form.service.EmployeeDao;

@Controller
public class EmpController
{
	@Autowired
	EmployeeDao employeeDao;
	@RequestMapping(value="/send" ,method=RequestMethod.GET)
	public String empForm(Model m)
	{
		m.addAttribute("employee", new Employee());
		return "empform";
		
	}
	/*@RequestMapping(value="/save" ,method=RequestMethod.POST)
	public String empSaveImage(@ModelAttribute("employee") Employee employee,Model m,HttpServletRequest request)
	{
		int n=employeeDao.save(employee, request);
		m.addAttribute("msg", "Insert Image with Id :"+" "+n);
		return "empform";
	}*/
  @RequestMapping(value="/fetch",method=RequestMethod.POST)
  public String getImage(@ModelAttribute("employee") Employee emp,Model m)
  {
	  System.out.println("IN Controller "+emp.getId());
	 Employee employee= employeeDao.getEmpById(emp.getId());
	 m.addAttribute("id", employee.getId());
	 m.addAttribute("name", employee.getName());
	 m.addAttribute("image", employee.getImage());
	 return "welcome";
  }
}
