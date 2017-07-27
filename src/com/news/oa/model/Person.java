package com.news.oa.model;
import java.sql.*;
public class Person {
	private int id;
	private String name;
	private Date born;
	private String sex;
	private String age;
	private String home;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public Date getBorn() {
		return born;
	}
	public void setBorn(Date born) {
		this.born=born;
	}
	
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex=sex;
	}
	
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age=age;
	}
	
	public void setHome(String home) {
		this.home=home;
	}
	public String getHome() {
		return home;
	}
	
}
