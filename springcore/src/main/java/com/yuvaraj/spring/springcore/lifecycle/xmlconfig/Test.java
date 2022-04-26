package com.yuvaraj.spring.springcore.lifecycle.xmlconfig;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("com/yuvaraj/spring/springcore/lifecycle/xmlconfig/lcconfig.xml");
		Patient p=(Patient) ctx.getBean("patient");
		System.out.println(p.toString());
		ctx.registerShutdownHook();
	}

}
