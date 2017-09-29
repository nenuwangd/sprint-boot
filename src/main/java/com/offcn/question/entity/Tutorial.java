package com.offcn.question.entity;

import java.io.Serializable;

public class Tutorial implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1055579651628108662L;
	private Long id;
	private String name;//教程名称
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Tutorial [id=" + id + ", name=" + name + "]";
	}
	
}