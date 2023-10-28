package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/standalone/collections/config.xml");
		Student student = (Student) context.getBean("student");
		System.out.println(student.getFriends());
		System.out.println(student.getFriends().getClass().getName());
		System.out.println("---------------------------------\n");

		System.out.println(student.getCourseMarks());
		System.out.println(student.getCourseMarks().getClass().getName());
		System.out.println("---------------------------------\n");

		System.out.println(student.getProps());
		System.out.println(student.getProps().getClass().getName());

	}

}
