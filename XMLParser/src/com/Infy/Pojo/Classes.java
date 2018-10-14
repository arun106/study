package com.Infy.Pojo;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class Classes {
	private List<Class> classObj;

	@XmlElement(name="class")
	public List<Class> getClassObj() {
		return classObj;
	}

	public void setClassObj(List<Class> classObj) {
		this.classObj = classObj;
	}

}
