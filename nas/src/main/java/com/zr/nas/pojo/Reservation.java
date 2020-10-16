package com.zr.nas.pojo;

public class Reservation {
	String name;
	String phone;
	String brand;//品牌
	String model;//车牌号
	String appoint_time;//预约时间
	String detail;//服务名称
	public Reservation(String name, String phone, String brand, String model, String appoint_time, String detail) {
		super();
		this.name = name;
		this.phone = phone;
		this.brand = brand;
		this.model = model;
		this.appoint_time = appoint_time;
		this.detail = detail;
	}
	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getAppoint_time() {
		return appoint_time;
	}
	public void setAppoint_time(String appoint_time) {
		this.appoint_time = appoint_time;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	@Override
	public String toString() {
		return "Reservation [name=" + name + ", phone=" + phone + ", brand=" + brand + ", model=" + model
				+ ", appoint_time=" + appoint_time + ", detail=" + detail + "]";
	}
	
}
