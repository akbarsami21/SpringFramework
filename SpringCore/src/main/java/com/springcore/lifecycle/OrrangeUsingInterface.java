package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class OrrangeUsingInterface implements InitializingBean,DisposableBean{
	
	private String price;

	public OrrangeUsingInterface() {
		super();
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		System.out.println("Before Initialization in Apple Class");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Orrange [price=" + price + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside Init Method In Orrange Class");
		
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("Inside Destroy Method In Orrange Class");
		
	}

}
