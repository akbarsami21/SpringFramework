package com.springcore.constinjection;

public class AdditionAmbiguity {
	private int x;
	private int y;

	public AdditionAmbiguity(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Constructor: int, int");
	}
	
	public AdditionAmbiguity(double x, double y) {
		this.x = (int) x;
		this.y = (int)y;
		System.out.println("Constructor: double, dobule");
	}
	
	public AdditionAmbiguity(String x, String y) {
		this.x = Integer.parseInt(x);
		this.y = Integer.parseInt(y);
		System.out.println("Constructor: String, String");
	}
	
	
	public void doSum() {
		System.out.println("x = "+this.x +" and y = "+this.y);
		System.out.println("Sum : "+(this.x+this.y));
	}

}
