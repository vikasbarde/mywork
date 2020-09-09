package com.bean.alias.service.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.bean.alias.service.owner.AmazonOrderManager;

public class BeanAliasTest {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("application-context.xml"));
		AmazonOrderManager manager = factory.getBean("amazonOrderManager", AmazonOrderManager.class);
		System.out.println(manager.setAmazonOrder());
	}

}
