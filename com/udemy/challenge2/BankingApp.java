package com.udemy.challenge2;


// You job is to create a simple banking application.
// There should be a Bank class
// It should have an arraylist of Branches
// Each Branch should have an arraylist of Customers
// The Customer class should have an arraylist of Doubles (transactions)
// Customer:
// Name, and the ArrayList of doubles.
// Branch:
// Need to be able to add a new customer and initial transaction amount.
// Also needs to add additional transactions for that customer/branch
// Bank:
// Add a new branch
// Add a customer to that branch with initial transaction
// Add a transaction for an existing customer for that branch
// Show a list of customers for a particular branch and optionally a list
// of their transactions
// Demonstration autoboxing and unboxing in your code
// Hint: Transactions
// Add data validation.
// e.g. check if exists, or does not exist, etc.
// Think about where you are adding the code to perform certain actions


public class BankingApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Bank b=new Bank("Nationl Bank");
		
		b.addBranch("Hyder");
		b.addBankCustomer("Hyder", "BOB", 11.258);
		b.addAnotherTranction("Hyder","BOB", 142.58);
		
		b.addAnotherTranction("Hyder", "BOB", 152.36);
		
		b.addBankCustomer("Hyder","TIM" , 1258.52);
		b.addAnotherTranction("Hyder","TIM" , 1258.52);
		
		
		
		b.addBranch("Natri");
		b.addBankCustomer("Natri", "BOBY", 11.258);
		b.addAnotherTranction("Natri","BOBY", 142.58);
		

		b.listNames("Hyder");
		//b.listNames("Natri");
		
		

	}

}
