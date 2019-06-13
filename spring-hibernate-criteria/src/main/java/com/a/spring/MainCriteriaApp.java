package com.a.spring;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.a.spring.config.AppConfig;
import com.a.spring.entity.Employee;
import com.a.spring.service.EmployeeService;

public class MainCriteriaApp {

	public static void main(String as[]) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		EmployeeService userService = context.getBean(EmployeeService.class);

		/*
		 * Employee emp=userService.employeeInfoById(); if(emp!=null) {
		 * System.out.println(emp.getId()); System.out.println(emp.getName());
		 * System.out.println(emp.getEmail());
		 * System.out.println(emp.getAddress());
		 * System.out.println(emp.getTelephone()); }
		 */

		List employee = userService.allEmployeeDetails();

		/*for (Object emp1 : employee) {
			Employee emp2 = (Employee) emp1;
			if (emp2 != null) {
				System.out.println(emp2.getId() + "\t" + emp2.getName() + "\t" + emp2.getEmail() + "\t"
						+ emp2.getAddress() + "\t" + emp2.getTelephone());

				System.out.println(emp2.getName()); //
				System.out.println(emp2.getEmail());

				System.out.println(emp2.getName());
				System.out.println(emp2.getEmail());
				System.out.println(emp2.getAddress());
				System.out.println(emp2.getTelephone());

			}
		}*/

		Iterator it = employee.iterator();
		while (it.hasNext()) {
			Object obj[] = (Object[]) it.next();
			System.out.println(obj[0] + "\t" + obj[1]);

		}

	}

}
