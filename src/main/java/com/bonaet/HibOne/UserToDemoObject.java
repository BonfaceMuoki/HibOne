package com.bonaet.HibOne;

import java.util.Objects;
//this is a POJO
public class UserToDemoObject implements Cloneable {
	private String firstName;
	private String lastName;

    public UserToDemoObject(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public UserToDemoObject() {
    	
    }
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName);
	}
	// @Override
	// public int hashCode() {
	// return name.hashCode() + age;
	// }

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserToDemoObject other = (UserToDemoObject) obj;
		//note that equals is case sensitive and equalsIgnoreCase is a String Method
		return Objects.equals(firstName.toLowerCase(), other.firstName.toLowerCase()) && Objects.equals(lastName.toLowerCase(), other.lastName.toLowerCase());
	}

	@Override
	protected Object clone() {
		// note that we have to throw CloneNotSupportedException because the class is not implementing clonable interface
	    try {
	        return super.clone();
	    } catch (CloneNotSupportedException e) {
	        e.printStackTrace();
	    }
	    return null;
	}
    // Manual clone method (without implementing Cloneable)
    public UserToDemoObject cloneManually() {
    	
        return new UserToDemoObject(this.firstName, this.lastName);
    }

	// @Override
	// public String toString() {
	// // returns something like UserToDemoObject@1a2b3c4d
	// return super.toString();
	// }
	@Override
	public String toString() {
		// returns something like UserToDemoObject [firstName=John, lastName=Doe]
		return "UserToDemoObject [firstName=" + firstName + ", lastName=" + lastName + "]";
	}


}
