package com.sbdemo.restapidemo179.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sbdemo.restapidemo179.entity.Student;
import com.sbdemo.restapidemo179.service.TestServices;

@RestController
public class TestController {


	@Autowired
	TestServices testServices;
	
	@RequestMapping("/page1")
	public String trialMethod()
	{
		return "Hello Folks";
	}
	
	@GetMapping("/hello")
	public String tryMethod()
	{
		return testServices.sayHello();
	}
	
	@GetMapping("/names")
	public List<String> getAllData()
	{
		return testServices.getData();
	}
	// to get all the data from the database
	@GetMapping("/getalldata")
	public List<Student> getAllStudentData()
	{
		return testServices.getAllStudentData();
	}
	// to fetch the data from the table based on the pathvariable
	@GetMapping("/getdatabyid/{id}")
	public Student getDataById(@PathVariable int id)
	{
		System.err.println(id);
		return testServices.getDataById(id);
		}
	@GetMapping("/getdatabycity")
	public List<Student> getDataByCity(@RequestParam String city)
	{
		System.err.println(city);
		return testServices.getDataByCity(city);
		}
	@GetMapping("/getdatabyidd")
	public void getDataByIdd(@RequestParam int stid,@RequestParam String name)
	{
		System.err.println(stid);
		System.err.println(name);
		//return testServices.getById(id);
		}
	
	@PostMapping("/adddata")
	public void addStudentData(@RequestBody Student student)
	{
		testServices.addStudentData(student);
	}
	
	@PutMapping("/updatedata")
	public void updateStudentData(@RequestBody Student student)
	{
		testServices.updateStudentData(student);
	}
}