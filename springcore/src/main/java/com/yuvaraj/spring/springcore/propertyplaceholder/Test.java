package com.yuvaraj.spring.springcore.propertyplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("com/yuvaraj/spring/springcore/propertyplaceholder/ppconfig.xml");
	MyDAO m=(MyDAO) ctx.getBean("mydao");
	System.out.println(m);
	}
}
