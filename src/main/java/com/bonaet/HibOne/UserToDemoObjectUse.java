package com.bonaet.HibOne;

public class UserToDemoObjectUse {

	public static void main(String[] args) {

		UserToDemoObject user = new UserToDemoObject(); // since the UserToDemoObject POJO has got 2 constructors
														// parameterized and non parameterized
		user.setFirstName("Bonface");
		user.setLastName("Muoki");

		UserToDemoObject user2 = new UserToDemoObject("Bonface", "Muoki");

		// using toString - output would be User Properties are :UserToDemoObject
		// [firstName=Bonface, lastName=Muoki]
		System.out.println("User Properties are :" + user);

		// equals
		System.out.println("Are the 2 users equal :" + user.equals(user2)); // true
		// hashcode
		System.out.println("The hash code for user1 is" + user.hashCode()); // The hash code for user1 is2111127368
		System.out.println("The hash code for user2 is" + user2.hashCode()); // The hash code for user1 is2111127368
		// clone manually
		UserToDemoObject user3 = (UserToDemoObject) user.cloneManually();
		System.out.println("Clone user 3 : " + user3); // Clone user 3 : UserToDemoObject [firstName=Bonface, lastName=Muoki]
		// clone
		UserToDemoObject user4 = (UserToDemoObject) user.clone();
		System.out.println("Clone user 4 : " + user4);


	}
}
