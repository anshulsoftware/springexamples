package com.form.service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import com.form.bean.Employee;
@Repository
public class EmployeeDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public int save(Employee emp,HttpServletRequest request)
	{
		Integer id=emp.getId();
		System.out.println(id);
		String name=emp.getName();
		System.out.println(name);
		
		 List<MultipartFile> img= emp.getImage();
		 System.out.println(img);
		List<MultipartFile> files=emp.getImage();
		System.out.println(files);
		List<String> fileNames=new ArrayList<String>();
		if(files!=null && files.size()>0)
		{
			for(MultipartFile multipartFile:files)
			{
				String fileName=multipartFile.getOriginalFilename();
				fileNames.add(fileName);
				System.out.println("Real Path ::"+request.getServletContext().getRealPath("src/main/webapp/resources/images"));

				//File imageFile=new File(request.getServletContext().getRealPath("/resources/images"),fileName);
				
			File imageFile=new File(request.getSession().getServletContext().getRealPath("/resources/")+"/images/"+fileName);
				
				try {
					multipartFile.transferTo(imageFile);
				} catch (IllegalStateException e) {
					
					e.printStackTrace();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
			
			
		}
		
		Object obj[] = { id,name,fileNames};
		String sql = "insert into image_table values(?,?,?)";
		int k=jdbcTemplate.update(sql,obj);
		System.out.println("Id is :::"+k);
		return k;
	}
	public Employee getEmpById(int id) {
		
		String sql = "select * from image_table where id=?";
	Employee emp=	jdbcTemplate.queryForObject(sql, new Object[] { id },new BeanPropertyRowMapper<Employee>(Employee.class));
	System.out.println(emp.getImage());
	System.out.println(emp.getName());
		return emp;
	}
}
