package com.udemy.challenge1;

public class Contact {

	public  String name;
	public  String phoneNumber;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Contact(String name,String phoneNumber) {
		this.name=name;
		this.phoneNumber=phoneNumber;
	}
	
	public static Contact createContact(String name,String phonenumber){
		return new Contact(name,phonenumber);
	}

}
