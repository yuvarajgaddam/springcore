package com.yuvaraj.spring.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/yuvaraj/spring/springcore/constructorinjection/ciconfig.xml");
		Employee e=(Employee) ctx.getBean("employee");
		System.out.println(e);
	}

}
