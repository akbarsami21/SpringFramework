package com.springcore.standalone.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Student {
	private List<String> friends;
	private Map<String,Integer> courseMarks;
	private Properties props;

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	
	

	public Map<String, Integer> getCourseMarks() {
		return courseMarks;
	}

	public void setCourseMarks(Map<String, Integer> courseMarks) {
		this.courseMarks = courseMarks;
	}
	
	

	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

	@Override
	public String toString() {
		return "Student [friends=" + friends + "]";
	}
	
	

}
