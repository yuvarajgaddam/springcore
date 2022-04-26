package com.yuvaraj.spring.springcore.reftypes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/yuvaraj/spring/springcore/reftypes/refconfig.xml");
		Student s=(Student) ctx.getBean("student");
		System.out.println(s.toString());
	}

}
