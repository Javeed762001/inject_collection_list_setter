package com.ty.inject_list_value_setter;

import java.util.List;

public class Student {

	private String name;
	private int age;
	private List<String> subjectName;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<String> getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(List<String> subjectName) {
		this.subjectName = subjectName;
	}
	
	
}
