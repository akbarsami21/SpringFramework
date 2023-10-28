package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employ {

	private String name;
	private List<String> phones;
	private Set<String> email;
	private Map<String, String> workDuration;
	private Properties prop;

	public Employ(String name, List<String> phones, Set<String> email, Map<String, String> workDuration,
			Properties prop) {
		super();
		this.name = name;
		this.phones = phones;
		this.email = email;
		this.workDuration = workDuration;
		this.prop = prop;
	}

	public Employ() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getPhones() {
		return phones;
	}

	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

	public Set<String> getEmail() {
		return email;
	}

	public void setEmail(Set<String> email) {
		this.email = email;
	}

	public Map<String, String> getWorkDuration() {
		return workDuration;
	}

	public void setWorkDuration(Map<String, String> workDuration) {
		this.workDuration = workDuration;
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}
	

}
