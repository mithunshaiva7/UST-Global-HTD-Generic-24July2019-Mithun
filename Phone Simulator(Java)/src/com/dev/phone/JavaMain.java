package com.dev.phone;

import java.util.Scanner;

public class JavaMain {
	public static void display() {
		Scanner s=new Scanner(System.in);
		
		
		System.out.println("Press 1 to Show All Contacts");
		System.out.println("Press 2 to search for contact(by name)");
		System.out.println("Press 3 to operate on contact");
		int choice=s.nextInt();

	if(choice==1) {
		ContactCrud.showContact();
	}
	else if(choice==2) {
		System.out.println("Enter the contact name:");
		String consoleName=s.next();
		System.out.println("Press 1 to call");
		System.out.println("Press 2 to message");
		System.out.println("Press 3 to Go back");
		
		System.out.println("Press the number:");
		int choice1=s.nextInt();
		if(choice1==1) {
			ContactCrud.makeCall(consoleName);
		}
		else if(choice1==2) {
			ContactCrud.makeMessage(consoleName);
		}
		else if(choice1==3) {
			display();
		}
		
	}
	else if(choice==3) {
		System.out.println("Press 1 to add contact");
		System.out.println("Press 2 to delete Contact");
		System.out.println("Press 3 to edit contact");
		System.out.println("Enter your choice:");
		int choice2=s.nextInt();
		if(choice2==1) {
			ContactCrud.addContact();
		}
		else if(choice2==2) {
			ContactCrud.deleteContact();
		}
		else if(choice==3) {
			ContactCrud.editContact();
		}
	}


	}
public static void main(String[] args) {
	
	JavaMain.display();
}
}

