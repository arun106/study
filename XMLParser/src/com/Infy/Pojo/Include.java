package com.Infy.Pojo;

import javax.xml.bind.annotation.XmlAttribute;

public class Include {
	private String name;

	@XmlAttribute
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
