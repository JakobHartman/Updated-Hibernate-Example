package com.hibernate.test;

import javax.persistence.*;


@Entity
//@Table(name = "phone_number")
public class phone_number {

	@Id
	private int id;
	private String UserName;
	private String Pssword;
	private int PhoneNumber;
	
	public void setUserId(int id) {
		this.id = id;
		
	}

	public void setUserName(String UserName) {
		this.UserName = UserName;
		
	}

	public void setPssword(String Pssword) {
		this.Pssword = Pssword;
		
	}

	public void setPhoneNumber(int PhoneNumber) {
		this.PhoneNumber = PhoneNumber;
		
	}

	public int getId() {
		return id;
	}

	public String getUserName() {
		return UserName;
	}

	public String getPssword() {
		return Pssword;
	}

	public int getPhoneNumber() {
		return PhoneNumber;
	}

}