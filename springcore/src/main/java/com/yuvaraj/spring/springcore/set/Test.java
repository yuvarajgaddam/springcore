package com.yuvaraj.spring.springcore.set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/yuvaraj/spring/springcore/set/setconfig.xml");
		CarDealer c = (CarDealer) ctx.getBean("cardealer");
		System.out.println(c.getName());
		System.out.println(c.getModels());
	}

}
