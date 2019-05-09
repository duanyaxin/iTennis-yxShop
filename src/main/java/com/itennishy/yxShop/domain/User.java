package com.itennishy.yxShop.domain;

import java.util.Date;

public class User {
	private int id;
	private String name;
	private String pwd;
	private String phone;
	private String email;
	private Date brithtime;
	private Date createtime;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBrithtime() {
		return brithtime;
	}
	public void setBrithtime(Date brithtime) {
		this.brithtime = brithtime;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public User(int id, String name, String pwd, String phone, String email, Date brithtime, Date createtime) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.phone = phone;
		this.email = email;
		this.brithtime = brithtime;
		this.createtime = createtime;
	}
	public User() {
		super();
	}
}
