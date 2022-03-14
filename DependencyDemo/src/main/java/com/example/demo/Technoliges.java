package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Technoliges {
	
	private int techid;
	private String techname;
	public int getTechid() {
		return techid;
	}
	public String getTechname() {
		return techname;
	}
	public void setTechid(int techid) {
		this.techid = techid;
	}
	public void setTechname(String techname) {
		this.techname = techname;
	}
	public void tech() {
		System.out.println("completed");
		
	}
}
