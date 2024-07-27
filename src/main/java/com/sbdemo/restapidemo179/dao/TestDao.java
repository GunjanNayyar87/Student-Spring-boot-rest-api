package com.sbdemo.restapidemo179.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.sbdemo.restapidemo179.entity.Student;

@Repository
public class TestDao {

	@Autowired
	SessionFactory factory;
	
	public String sayHello()
	{
		return "Hello From DAO Page!";
	}
	public List<String> getData()
	{
		ArrayList<String> al = new ArrayList<>();
		al.add("Dipak");
		al.add("Kapil");
		al.add("Pravin");
		al.add("Mahesh");
		al.add("Bharti");
		al.add("Mayuri");
		
		return al;
	}
	public List<Student> getAllStudentData() {
		Session session=factory.openSession();
		// checking if the connection is open or not
		System.err.println("factory>>>"+factory.isClosed());
		Transaction tx=session.beginTransaction();
		Criteria criteria=session.createCriteria(Student.class);
		List <Student> studentlist=criteria.list();
		return studentlist;
	}
	public void addStudentData(Student student) {
		Session session=factory.openSession();
		// checking if the connection is open or not
		System.err.println("factory>>>"+factory.isClosed());
		Transaction tx=session.beginTransaction();
		session.save(student);
		tx.commit();
	}
	public void updateStudentData(Student student) {
		Session session=factory.openSession();
		// checking if the connection is open or not
		System.err.println("factory>>>"+factory.isClosed());
		Transaction tx=session.beginTransaction();
		session.update(student);
		tx.commit();
		
	}
	public Student getDataById(int id) {
		// write the code to fetch data based on the id
		Session session=factory.openSession();
		// checking if the connection is open or not
		System.err.println("factory>>>"+factory.isClosed());
		Transaction tx=session.beginTransaction();
		Student st= session.load(Student.class,id);
		System.out.println(st);
//		Criteria criteria=session.createCriteria(Student.class);
//		criteria.add(Restrictions.eq("stid", id));
//		List<Student> stList=criteria.list();
//		for()
		return st;
	}
	public List<Student> getDataByCity(String city) {
		Session session=factory.openSession();
		// checking if the connection is open or not
		System.err.println("factory>>>"+factory.isClosed());
		Transaction tx=session.beginTransaction();
		Criteria criteria=session.createCriteria(Student.class);
		criteria.add(Restrictions.eq("city", city));
		List<Student> studentlist=criteria.list();
		return studentlist;
	}

}