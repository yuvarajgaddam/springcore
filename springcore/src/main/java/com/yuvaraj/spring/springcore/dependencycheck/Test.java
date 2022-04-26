package com.yuvaraj.spring.springcore.dependencycheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/yuvaraj/spring/springcore/dependencycheck/dcconfig.xml");
		Patient p=(Patient) ctx.getBean("prescription");
		System.out.println(p.toString());
		
		
	}

}
