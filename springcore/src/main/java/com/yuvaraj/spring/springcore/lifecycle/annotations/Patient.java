package com.yuvaraj.spring.springcore.lifecycle.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class Patient  {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@PostConstruct
	public void hi() {
		System.out.println("Inside hi");
	}
	
	@PreDestroy
	public void bye() {
		System.out.println("Inside bye");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}


	
}
