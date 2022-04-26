package com.yuvaraj.spring.springcore.properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/yuvaraj/spring/springcore/properties/propertiesconfig.xml");
		CountriesAndLanguages c=(CountriesAndLanguages) ctx.getBean("countriesandlangs");
		System.out.println(c.toString());
	}

}
