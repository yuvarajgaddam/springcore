package com.yuvaraj.spring.springcore.innerbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/yuvaraj/spring/springcore/innerbeans/ibconfig.xml");
		Employee e=(Employee) ctx.getBean("Employee");
		System.out.println(e.hashCode());
		
		Employee e1=(Employee) ctx.getBean("Employee");
		System.out.println(e1.hashCode());
	}

}
