package com.spring.valuerequired;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {
	@Value("${Student.name}")
	private String name;
	
	@Value("${Student.intrestedCourse}")
	private String intrestedCourse;
	
	@Value("${Student.hobby}")
	private String hobby;

	
	
	public void setName(String name) {
		this.name = name;
		System.out.println("using the setName method");

	}

	
	
	public void setIntrestedCourse(String intrestedCourse) {
		this.intrestedCourse = intrestedCourse;
		System.out.println("using the setintrestedCourse method");
	}

	
	public void setHobby(String hobby) {
		this.hobby = hobby;
		System.out.println("using the sethobby method");
	}

	public void displayStudentInfo() {
		System.out.println("Student name" + name);
		System.out.println("intrested course" + intrestedCourse);
		System.out.println("hobby" + hobby);
	}
}
