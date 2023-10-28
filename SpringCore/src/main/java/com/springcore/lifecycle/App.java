package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		/*
		 * Apple a1=(Apple) context.getBean("a1"); System.out.println(a1);
		 * context.registerShutdownHook(); //giving notice for call destroy method in
		 * classes or beans
		 * 
		 * System.out.println("---------------------------------------");
		 * OrrangeUsingInterface o1=(OrrangeUsingInterface) context.getBean("o1");
		 * System.out.println(o1);
		 */
	    
		
		MangoAnnotations mango=(MangoAnnotations) context.getBean("mango");
		System.out.println(mango);
		context.registerShutdownHook();
		
	}

}
