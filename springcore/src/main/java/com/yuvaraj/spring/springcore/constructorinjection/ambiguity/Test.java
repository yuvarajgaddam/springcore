package com.yuvaraj.spring.springcore.constructorinjection.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/yuvaraj/spring/springcore/constructorinjection/ambiguity/ciconfig.xml");
		Addition e=(Addition) ctx.getBean("addition");
		System.out.println(e);
	}

}
