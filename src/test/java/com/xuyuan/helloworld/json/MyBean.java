package com.xuyuan.helloworld.json;

import java.util.List;

public class MyBean {

	/**
	 * @uml.property  name="data"
	 */
	private List<Person> data;

	public List<Person> getData() {
		return data;
	}

	public void setData(List<Person> data) {
		this.data = data;
	}
	
}
