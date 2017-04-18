package com.udemy.challenge2;

import java.util.ArrayList;

public class Branch {

	
	 private String name;
	private ArrayList<Customer> customers;
	
	
	public Branch( String name) {
	    this.name = name;
	    this.customers=new ArrayList<Customer>();
	    
	}
	
	public void setName(String name) {
		this.name = name;
	}

	 
	public String getName() {
		return name;
	}
	
	public boolean newCustomer(String customername,Double customeramount){
		if(findCustomer(name)==null){
			this.customers.add( new Customer(customername, customeramount));
			return true;
		}
		
		return false;
	}
	
	public ArrayList<Customer> getCustomer() {
		
		return customers;
	}
	
	public  boolean addCustomerTranction(String cname,Double amount){
		
		Customer existingCustomer= findCustomer(cname);
		   if(existingCustomer!=null){ 
			  existingCustomer.addTranctions(amount);
			  return true;
		   }
		
		return false;
		
	}
	

	private Customer findCustomer(String name2) {
		
       for (int i = 0; i <customers.size(); i++) { 
    	  if(customers.get(i).getName().equals(name2)){
    		  return customers.get(i);
    	  }	
	  }  
		return null;
	}


	
	

}
