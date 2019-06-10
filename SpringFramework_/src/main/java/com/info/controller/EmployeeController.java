package com.info.controller;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.info.model.Employee;
import com.info.service.EmployeeDao;
@Controller
public class EmployeeController {
	@Autowired
	EmployeeDao employeeDao;

	@RequestMapping(value="/empform")
	public String showform(Model m) {
		Employee employee = new Employee();
		m.addAttribute("emp", employee);
		return "empform";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String empSave(@Valid @ModelAttribute("emp") Employee employee, BindingResult br, Model m) {
		if (br.hasErrors()) {
			return "empform";
		}
		int i = employeeDao.exist(employee.getId());
		if (i == 0) {
			int k = employeeDao.save(employee);
			if (k != 0) {
				m.addAttribute("msg", "Employee data successfully inserted with Id" + " " + employee.getId());
				return "show";
			}
		}
		m.addAttribute("err", "This Id is already exist so enter another Id");
		return "error";
	}

	@RequestMapping("/viewemp")
	public String viewemp(Model m) {
		List<Employee> list = employeeDao.getEmployees();
		m.addAttribute("list", list);
		return "viewemp";
	}

	@RequestMapping(value = "/editemp/{id}")
	public String edit(@PathVariable int id, Model m) {
		Employee emp = employeeDao.getEmpById(id);
		m.addAttribute("command", emp);
		return "empeditform";
	}

	@RequestMapping(value = "/editsave", method = RequestMethod.POST)
	public String editsave(@ModelAttribute("emp") Employee emp){
		int j = employeeDao.update(emp);
		return "redirect:/viewemp";
	}

	@RequestMapping(value = "/deleteemp/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable int id) {
		int i = employeeDao.delete(id);
		return "redirect:/viewemp";
	}
}
