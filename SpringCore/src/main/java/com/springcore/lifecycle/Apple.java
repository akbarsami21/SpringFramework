package com.springcore.lifecycle;

public class Apple {
	private String price;

	public Apple() {
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
		return "Apple [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("Inside Init Mehtod In Apple Class");
	}
	
	public void destroy() {
		System.out.println("Inside Destroy Method In Apple Class");
	}

}
