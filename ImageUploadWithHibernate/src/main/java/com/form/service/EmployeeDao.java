package com.form.service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import com.form.bean.Employee;
import com.form.bean.Images;
@Repository
public class EmployeeDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public int save(Employee emp, HttpServletRequest request) {
		Session session=sessionFactory.getCurrentSession();
		Integer id = emp.getId();
		String name = emp.getName();	
		List<MultipartFile> files = emp.getImage();
		List<String> fileNames = new ArrayList<String>();		
		if (files != null && files.size() > 0) {
			for (MultipartFile multipartFile : files) {
				String fileName = multipartFile.getOriginalFilename();
				fileNames.add(fileName);
				
				String path = "F:\\WorkSpace\\ImageUploadWithHibernate\\src\\main\\resources\\images";						
				File imageFile = new File(path + "/" + fileName);
				try {
					multipartFile.transferTo(imageFile);
				} catch (IllegalStateException e) {

					e.printStackTrace();
				} catch (IOException e) {

					e.printStackTrace();
				}
			}
		}		
		Images img=new Images();
		img.setId(id);
		img.setName(name);
		img.setImgpath(fileNames.get(0));
		int k=(Integer) session.save(img);			
		System.out.println("Id is :::" + k);
		return k;
	}
	public Images getEmpById(int id) {
		Session session=sessionFactory.getCurrentSession();		
		Object obj=session.get(Images.class, id);
		Images emp=(Images)obj;
		return emp;
	}

}
