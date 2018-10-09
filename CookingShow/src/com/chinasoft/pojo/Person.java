package com.chinasoft.pojo;

import org.springframework.stereotype.Component;

@Component("person")
public class Person {

	private int id;
	private String name;
	private String pwd;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public void sing() {
		System.out.println("我要唱歌了！");
	}
}
