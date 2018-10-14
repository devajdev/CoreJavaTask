package com.nt.io;

public class Entity {

	private String id;
	private String firstName;
	private String lastName;
	private String dob;
	private String address;
	private String balance;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Entity =[ Id = " + id + ", FirstName = " + firstName + ", LastName = " + lastName + ", Dob = " + dob
				+ ", Address = " + address + ", Balance = " + balance + " ]";
	}

	
}
