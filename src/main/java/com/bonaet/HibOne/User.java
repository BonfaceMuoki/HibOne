package com.bonaet.HibOne;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	 @Id	 
	 @GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int id;
	private String Fname;
	private String Lname;

	public String getFname() {
		return Fname;
	}

	@Override
	public String toString() {
		return "User [Fname=" + Fname + ", Lname=" + Lname + "]";
	}

	public void setFname(String fname) {
		Fname = fname;
	}

	public String getLname() {
		return Lname;
	}

	public void setLname(String lname) {
		Lname = lname;
	}

}
