package com.te.annotationjava.lifecycle;

import java.io.Serializable;

public class LifeCycleMethods implements Serializable {

	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("inside setid");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("inside set name");
		this.name = name;
	}

	
	public void init() {
		System.out.println("inside init  ");
	}
	
	public void destroy() {
		System.out.println("inside destroy");
	}

	@Override
	public String toString() {
		return "LifeCycleMethods [id=" + id + ", name=" + name + "]";
	}
	
	
}
