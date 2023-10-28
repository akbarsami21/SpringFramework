package com.springcore.constinjection;

import java.util.List;

public class Person {
	private String name;
	private int id;
	private Certificate certificate;
	private List<String> phones;
	
	public Person(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	
	public Person(String name, int id, Certificate certificate) {
		super();
		this.name = name;
		this.id = id;
		this.certificate = certificate;
	}
	
	


	public Person(String name, int id, Certificate certificate, List<String> phones) {
		super();
		this.name = name;
		this.id = id;
		this.certificate = certificate;
		this.phones = phones;
	}


	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return this.id + " : " +this.name+"{ "+this.certificate+"}"+this.phones;
	}
	
	

}
