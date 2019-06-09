package com.info.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import com.info.model.Employee;

@Repository
public class EmployeeDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public int save(Employee p) {
		int id = p.getId();
		String name = p.getName();
		int salary = p.getSalary();
		String designation = p.getDesignation();
		Object obj[] = { id, name, salary, designation };
		String sql = "insert into empinfo values(?,?,?,?)";
		//System.out.println("hi.....");
		/*
		 * int k=template.update("insert into empinfo values(?,?,?,?)", new
		 * Object[]{p.getId(),p.getName(),p.getSalary(),p.getDesignation()});
		 */
		int k = jdbcTemplate.update(sql, obj);
		// System.out.println("some prob.........");
		return k;
	}

	public int update(Employee p){
		int id = p.getId();
		String name = p.getName();
		int salary = p.getSalary();
		String designation = p.getDesignation();
		Object obj[] = { id, name, salary, designation };
		String sql = "update empinfo set name=?,salary=?,designation=? where id=?";
		int k = jdbcTemplate.update(sql, obj);
		return k;
	}

	public int delete(int id) {
		String sql = "delete from empinfo where id=?";
		int k = jdbcTemplate.update(sql, new Object[] { id });
		return k;
	}

	public List<Employee> getEmployees() {
		return jdbcTemplate.query("select * from empinfo", new RowMapper<Employee>() {
			public Employee mapRow(ResultSet rs, int row) throws SQLException {
				Employee e = new Employee();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setSalary(rs.getInt(3));
				e.setDesignation(rs.getString(4));
				return e;
			}
		});
	}

	public Employee getEmpById(int id) {
		String sql = "select * from empinfo where id=?";
		return jdbcTemplate.queryForObject(sql, new Object[] { id },
				new BeanPropertyRowMapper<Employee>(Employee.class));
	}

	public int exist(int id) {
		String sql = "select count(*) from empinfo where id=?";
		return jdbcTemplate.queryForObject(sql, new Object[] { id }, Integer.class);
	}
}
