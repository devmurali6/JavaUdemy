package com.udemy.challenge1;

import java.util.ArrayList;

public class MobilePhone {
	
	public  ArrayList<Contact> mobileList = new ArrayList<>();
	
	
	
	public boolean addNewContact(Contact contact){
	    if(findContact(contact.getName())>=0){
	    	System.out.println("Contact is already exist ");
	    	return false;
	    }
	    
	    	mobileList.add(contact);
		    return true; 
	}
	
	public  void display(){
		
		for(int i=0;i<mobileList.size();i++){
		   	System.out.println("Name:"+mobileList.get(i).name+" , "+"Phone Number:" +mobileList.get(i).phoneNumber);
		}
	}
		
	
	private int findContact(Contact contact) {
		// TODO Auto-generated method stub
		return this.mobileList.indexOf(contact);
	}
	
	private int findContact(String contactName){
		for(int i=0;i<this.mobileList.size();i++){
		Contact contact= this.mobileList.get(i);
		 if(contact.getName().equals(contactName))
			 return i;
		
	}
		return -1;
	}

	public boolean updateContact(Contact oldItem,Contact newItem) {
		
		int findposition=findContact(oldItem);
		if(findposition<0){
			System.out.println(oldItem.getName()+ ", was not found");
		   return false;	
		}
		


			mobileList.set(findposition, newItem);
			System.out.println(oldItem.getName() + " is replaced with" +newItem.getName());

		  return true;
		
		
	}
	
	public boolean removeContact(Contact contact){
		
		int findposition=findContact(contact);
		if(findposition<0){
			System.out.println(contact.getName()+ ", was not found");
		   return false;	
		}
		else{
			mobileList.remove(contact);
			System.out.println(contact.getName()+"was deleted");
			return true;
		}
		
		
		
	}
	
	public String queryContact(Contact contact){
		
		if(findContact(contact)>=0){
			
			return contact.getName();
		}
		return null;
		
		
	}
	
public Contact queryContact(String name){
	
	int position=findContact(name);
	if(position>=0){
		return  this.mobileList.get(position);
	}
	return null;
		
	}

}
