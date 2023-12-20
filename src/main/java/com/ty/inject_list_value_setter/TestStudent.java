package com.ty.inject_list_value_setter;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

	public static void main(String[] args) {
		ApplicationContext appCont=new ClassPathXmlApplicationContext("my_config.xml");
		Student student=(Student)appCont.getBean("myStudent");
		
		System.out.println(student.getName());
	    
		List<String> subjects=student.getSubjectName();
		System.out.println("-----------------subject list----------------");
		
		for(String subject: subjects)
		{
			System.out.println(subject);
		}

	}
}
