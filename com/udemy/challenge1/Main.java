package com.udemy.challenge1;

import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);
	public static MobilePhone mobilephone = new MobilePhone();

	public static void main(String k[]) {
		boolean quit = false;
		int choice = 0;
		while (!quit) {

			System.out.println("Enter the choice:");
			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 0:
				printIntructions();
				break;
			case 1:
				mobilephone.display();
				break;
			case 2:
				addNewContact();
				break;
			case 3:
				updateExistingContact();
				break;
			case 4:
				removeContact();
				break;
			case 5:
				queryContact();
				break;
			case 6:
				quit = true;
				break;

			}

		}
	}

	private static void removeContact() {

		System.out.println("Enter an existing contact");
		String name = scanner.nextLine();

		Contact existingContactRecord = mobilephone.queryContact(name);
		if (existingContactRecord == null) {
			System.out.println("contact not found");
			return;
		}

		if (mobilephone.removeContact(existingContactRecord)) {

			System.out.println("sucessfully removed");
		} else {
			System.out.println("error in removed the record");
		}

	}

	public static void queryContact() {

		System.out.println("Enter an existing contact");
		String name = scanner.nextLine();

		Contact existingContactRecord = mobilephone.queryContact(name);
		if (existingContactRecord == null) {
			System.out.println("contact not found");
			return;
		}

		System.out
				.println("Name: " + existingContactRecord.getName()
						+ " phone number is  "
						+ existingContactRecord.getPhoneNumber());

	}

	private static void updateExistingContact() {

		System.out.println("Enter an existing contact");
		String name = scanner.nextLine();

		Contact existingContactRecord = mobilephone.queryContact(name);
		if (existingContactRecord == null) {
			System.out.println("contact not found");
			return;
		}

		System.out.println("enter new contact name");
		String contname = scanner.nextLine();
		System.out.println("enter new contact number");
		String number = scanner.nextLine();

		Contact newItem = Contact.createContact(contname, number);
		if (mobilephone.updateContact(existingContactRecord, newItem)) {
			System.out.println("succesfully updated");
		} else {
			System.out.println("error updateding record");
		}

	}

	private static void printListofContacts() {
		System.out.println(" list of contacts");

	}

	private static void addNewContact() {
		System.out.println("Enter an contact to add");
		String contname = scanner.nextLine();
		String number = scanner.nextLine();
		Contact temp = Contact.createContact(contname, number);
		if (mobilephone.addNewContact(temp)) {
			System.out.println("New contact added " + "name" + contname
					+ "phone" + number);
		} else {
			System.out.println("cannot add" + contname + "is already exist");
		}
	}

	private static void printIntructions() {
		System.out.println("\nPress");
		System.out.println("\t 0   --  to print choice options");
		System.out.println("\t 1   --  to print list of contacts");
		System.out.println("\t 2   --  to add a contact");
		System.out.println("\t 3   --  to update a existing contact");
		System.out.println("\t 4   --  to remove a contact");
		System.out.println("\t 5   --  to find or search a contact");
		System.out.println("\t 6   --  to quit from application");

	}

}
