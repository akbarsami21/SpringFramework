package com.springcore.Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
	  ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/Autowiring/config.xml");
		/*
		 * Student student=(Student)context.getBean("student");
		 * System.out.println(student);
		 */
	  
	  EmployAnnotations employe=(EmployAnnotations) context.getBean("employe");
	  System.out.println(employe);
	}

}
