package com.austincc.java3.domain;

public class Person {
	private String firstName;
	private String lastName;
	private String email;
	
	// Getters and Setters
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [firstName=").append(firstName)
				.append(", lastName=").append(lastName).append(", email=")
				.append(email).append("]");
		return builder.toString();
	}
	
	
}
