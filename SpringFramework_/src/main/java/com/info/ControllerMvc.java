package com.info;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerMvc {
	@RequestMapping("/send")
	public String empForm(Model m) {
		EmployeeA employee=new EmployeeA();
		m.addAttribute("emp", employee);
		
		return "employee";
	}
	@RequestMapping("/submitForm")
	public String empSubmit(@Valid @ModelAttribute("emp") EmployeeA employee,BindingResult br)
	{
		if(br.hasErrors())
		{
			return "employee";
		}
		return "welcome";
	}

}
