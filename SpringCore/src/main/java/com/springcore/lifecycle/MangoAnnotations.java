package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class MangoAnnotations {
	private String price;

	public MangoAnnotations() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "MangoAnnotations [price=" + price + "]";
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Inside Init Method In MangoAnnotations Class");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Inside Destroy Method In MangoAnnotations Class");
	}

}
