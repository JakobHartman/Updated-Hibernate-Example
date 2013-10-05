package com.hibernate.test;

import javax.persistence.*;


@Entity
//@Table(name = "phone_number")
public class address {
	
	@Id
	private int id;
	private int Street_num;
	private String Street;
	private String city;

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getStreet_num() {
		return Street_num;
	}
	
	public void setStreet_num(int Street_num) {
		this.Street_num = Street_num;
	}
	
	public String getStreet() {
		return Street;
	}
	
	public void setStreet(String street) {
		this.Street = street;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {

		this.city = city;
	}
	
	
}