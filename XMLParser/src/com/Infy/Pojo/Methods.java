package com.Infy.Pojo;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class Methods {
	private List<Include> include;

	@XmlElement
	public List<Include> getInclude() {
		return include;
	}

	public void setIncludeObj(List<Include> include) {
		this.include = include;
	}

}
