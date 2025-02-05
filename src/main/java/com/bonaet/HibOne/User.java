package com.bonaet.HibOne;

public class User {
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
