package com.zr.nas.pojo;

public class User {
	private Integer id;
	private String name;
	private Integer phone;
	private String loaction;
	private String remarks;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPhone() {
		return phone;
	}
	public void setPhone(Integer phone) {
		this.phone = phone;
	}
	public String getLoaction() {
		return loaction;
	}
	public void setLoaction(String loaction) {
		this.loaction = loaction;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public User(Integer id, String name, Integer phone, String loaction, String remarks) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.loaction = loaction;
		this.remarks = remarks;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", phone=" + phone + ", loaction=" + loaction + ", remarks="
				+ remarks + "]";
	}
	
	
	
}
