package com.demo.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	public static  void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Student student = context.getBean("student",Student.class);
		student.displayStudentInfo();
		
/*	Student chendu = context.getBean("chendu",Student.class);
	chendu.displayStudentInfo();
		
		Student manoj =new Student(11, "Manoj kotni");
		manoj .displayStudentInfo();*/
		Student lokiN=context.getBean("loki",Student.class);
		lokiN.displayStudentInfo();
	}


	}
