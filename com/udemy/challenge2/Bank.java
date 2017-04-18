package com.udemy.challenge2;

import java.util.ArrayList;

public class Bank {
	
	String name;
	ArrayList<Branch> branch;

	public Bank( String name) {
	    this.name = name;
	    this.branch=new ArrayList<Branch>();
	}
	
	

	public String getName() {
		
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public ArrayList<Branch> getBranch() {
		return branch;
	}
	
	
	public boolean addBranch(String name){
		
		if(findBranch(name)==null){
			this.branch.add(new Branch(name));
			return true;
			
		}
		return false;
		
	}
	
	public boolean addBankCustomer(String name,String cname,Double amount){
		Branch b=findBranch(name);
		if(b!=null){ 
		   
			return b.newCustomer(cname, amount);
		}
		return false;
	}
	
	public  boolean addAnotherTranction(String bname,String cname,Double amount){
		Branch b=findBranch(bname);
		   if(b!=null){ 
			  
			  return  b.addCustomerTranction(cname, amount);
		   }
		
		return false;
		
	}


	private Branch findBranch(String c) {
		
		for (int i = 0; i <branch.size(); i++) { 
	    	  if(branch.get(i).getName().equals(c)){
	    		  return branch.get(i);
	    	  }	
		  }  
 		return null;
	}
	
	public void listNames(String branchName){
		System.out.println("Bank name-->" +name);
	   Branch b=findBranch(branchName);
		if(b!=null){
			System.out.println("Branh Name -->" +b.getName());
			ArrayList<Customer> branchCustom=b.getCustomer();
			
			for (int i = 0; i < branchCustom.size(); i++) {
				
					System.out.println("Customer name-->" + branchCustom.get(i).getName() );
					System.out.println("Transctions Amount");
				for (int j = 0; j < branchCustom.get(i).getTranctions().size(); j++) {
					  System.out.println(branchCustom.get(i).getTranctions().get(j));
				}	
			}
		}	
	}
}
