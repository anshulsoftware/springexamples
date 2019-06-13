package com.a.spring.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.a.spring.entity.Employee;
@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public Employee employeeInfoById() {
		Session session=sessionFactory.getCurrentSession();
		@SuppressWarnings("deprecation")
		Criteria crit=session.createCriteria(Employee.class);
		
		crit.add(Restrictions.eq("id", 2));
		Employee emp=(Employee) crit.uniqueResult();
		
		return  emp;
	}

	@Override
	public List allEmployeeDetails() {
		Session session=sessionFactory.getCurrentSession();
		@SuppressWarnings("deprecation")
		Criteria crit=session.createCriteria(Employee.class);
		//crit.setProjection(Projections.property("name")); 
		Projection p1=Projections.property("name");
		Projection p2=Projections.property("email");
		ProjectionList pl=Projections.projectionList();
		pl.add(p1);
		pl.add(p2);
		crit.setProjection(pl);
		
		crit.setFirstResult(0);
		crit.setMaxResults(5);
		List empDetails=crit.list();
		
		return empDetails;
	}

}
