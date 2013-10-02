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
	
	public void setUserId(int i) {
		id = i;
		
	}

	public void setUserName(String i) {
		UserName = i;
		
	}

	public void setPssword(String i) {
		Pssword = i;
		
	}

	public void setPhoneNumber(int i) {
		PhoneNumber = i;
		
	}

}