package com.yuvaraj.spring.springcore.map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/yuvaraj/spring/springcore/map/mapconfig.xml");
		Customer c=(Customer) ctx.getBean("customer");
		System.out.println(c.toString());
	}

}
