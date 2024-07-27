package com.sbdemo.restapidemo179.entity;

import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	int stid;
	String sname;
	String city;
	public int getStid() {
		return stid;
	}
	public void setStid(int stid) {
		this.stid = stid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Student(int stid, String sname, String city) {
		super();
		this.stid = stid;
		this.sname = sname;
		this.city = city;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [stid=" + stid + ", sname=" + sname + ", city=" + city + "]";
	}
	
	
	
	
}
