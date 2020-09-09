package com.first.spring.work;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.first.spring.model.FirstModel;

public class FirstSpringWork {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		FirstModel model = (FirstModel) context.getBean("first");
		System.out.println(model);
		
	}

}
