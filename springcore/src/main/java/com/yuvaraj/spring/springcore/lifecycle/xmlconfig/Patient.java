package com.yuvaraj.spring.springcore.lifecycle.xmlconfig;

public class Patient {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void hi() {
		System.out.println("Inside hi");
	}
	
	public void bye() {
		System.out.println("Inside bye");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
	
}
