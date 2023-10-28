package com.springcore.Autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class EmployAnnotations {
	
	@Autowired
	@Qualifier("address1")
	private Address address;

	public EmployAnnotations(Address address) {
		super();
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "EmployAnnotations [address=" + address + "]";
	}

}
