package com.udemy.challenge2;

import java.util.ArrayList;

public class Customer {

	
	String name;
	ArrayList<Double> tranctions;
	
	public Customer(String name, Double initialAmout) {
	    this.name = name;
	    this.tranctions =new ArrayList<Double>();
	    addTranctions(initialAmout);
	}
	 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Double> getTranctions() {
		return tranctions;
	}
	public void addTranctions(Double amout) {
		this.tranctions.add(amout);
	}		 
}
