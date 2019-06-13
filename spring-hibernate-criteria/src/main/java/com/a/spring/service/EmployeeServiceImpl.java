package com.a.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.a.spring.dao.EmployeeDao;
import com.a.spring.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeDao employeeDao;
	@Override
	@Transactional
	public Employee employeeInfoById() {
		Employee emp=employeeDao.employeeInfoById();
		return emp;
	}
	@Override
	@Transactional
	public List allEmployeeDetails() {
		List empDetails=employeeDao.allEmployeeDetails();
		return empDetails;
	}

}
