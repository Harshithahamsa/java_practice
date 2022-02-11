package com.te.annotationjava.lifecycle;

import java.io.Serializable;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeCycleInterface implements Serializable, InitializingBean, DisposableBean {

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

	@Override
	public void destroy() throws Exception {
		System.out.println("inside destroy ");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("inside init");

	}

}
