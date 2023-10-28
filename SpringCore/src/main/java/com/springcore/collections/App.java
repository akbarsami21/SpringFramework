package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collections/config.xml");
		
		Employ empoye1=(Employ) context.getBean("emp1");
		System.out.println(empoye1.getName());
		System.out.println(empoye1.getPhones());
		System.out.println(empoye1.getEmail());
		System.out.println(empoye1.getWorkDuration());
		System.out.println(empoye1.getProp());
		
	}

}
