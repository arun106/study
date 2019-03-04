package com.xml.pojo;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Parameter {
	private String name,value;
	private List<Classes> classes;

	@XmlAttribute
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlAttribute
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@XmlElement
	public List<Classes> getClasses() {
		return classes;
	}

	public void setClassesObj(List<Classes> classes) {
		this.classes = classes;
	}
	

}
