package com.Infy.Pojo;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Class {
	private String name;
	private List<Methods> methods;
	
	@XmlAttribute
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@XmlElement
	public List<Methods> getMethods() {
		return methods;
	}
	public void setMethods(List<Methods> methods) {
		this.methods = methods;
	}

}
