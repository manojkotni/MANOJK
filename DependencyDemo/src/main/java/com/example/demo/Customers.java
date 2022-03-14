package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customers {
	private int custid;
	private String custname;
	private String coursename;
	@Autowired
	private Technoliges techdetails;
	public Technoliges getTechdetails() {
		return techdetails;
	}
	public void setTechdetails(Technoliges techdetails) {
		this.techdetails = techdetails;
	}
	public int getCustid() {
		return custid;
	}
	public String getCustname() {
		return custname;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public void display() {
		System.out.println("Customer obiect returned succesfully");
		techdetails.tech();
	}
	

}
