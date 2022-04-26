package com.yuvaraj.spring.springcore.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/yuvaraj/spring/springcore/list/listconfig.xml");
		Hospital h=(Hospital) ctx.getBean("hospital");
		System.out.println(h.getName());
		System.out.println(h.getDepartments());
	}

}
