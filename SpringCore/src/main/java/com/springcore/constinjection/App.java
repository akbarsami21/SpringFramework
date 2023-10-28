package com.springcore.constinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/constinjection/config.xml");
		Person p1=(Person) context.getBean("person");
		System.out.println(p1);
		
		AdditionAmbiguity add=(AdditionAmbiguity) context.getBean("addition");
		add.doSum();
	}

}
