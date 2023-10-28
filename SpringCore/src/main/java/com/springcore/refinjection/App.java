package com.springcore.refinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/refinjection/config.xml");
	    A a=(A)context.getBean("a1");
	    System.out.println(a);
	
	}

}
