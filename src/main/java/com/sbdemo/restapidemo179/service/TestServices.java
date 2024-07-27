package com.sbdemo.restapidemo179.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sbdemo.restapidemo179.dao.TestDao;
import com.sbdemo.restapidemo179.entity.Student;

@Component
public class TestServices {

	@Autowired
	TestDao testDao;
	
	public String sayHello()
	{
		return testDao.sayHello();
	}
	
	public List<String> getData()
	{
		return testDao.getData();
	}

	public List<Student> getAllStudentData() {
		// TODO Auto-generated method stub
		return testDao.getAllStudentData();
	}

	public void addStudentData(Student student) {
		// TODO Auto-generated method stub
		testDao.addStudentData(student);
	}

	public void updateStudentData(Student student) {
		testDao.updateStudentData(student);
		
	}

	public Student getDataById(int id) {
		// TODO Auto-generated method stub
		return testDao.getDataById(id);
	}

	public List<Student> getDataByCity(String city) {
		
		return testDao.getDataByCity(city);
	}

}
