package com.form.service;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.form.bean.Employee;
import com.form.bean.Images;
@Service
public class EmployeeService 
{
	
	@Autowired
	EmployeeDao employeeDao;
	@Transactional
	public int save(Employee emp,HttpServletRequest request)
	{
		int k=employeeDao.save(emp, request);
		return k;
	}
	@Transactional
	public Images getEmpById(Integer id) {
		Images img=employeeDao.getEmpById(id);
		return img;
	}

}
