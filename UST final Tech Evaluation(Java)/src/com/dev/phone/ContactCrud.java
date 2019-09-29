package com.dev.phone;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class ContactCrud {
	static HashSet<Contact> hs=new HashSet<Contact>();
	static Scanner s=new Scanner(System.in);
		
		public static void addContact() {
			System.out.println("Enter contact name:");
			String inputName=s.next();
			System.out.println("Enter contact number:");
			long inputNumber=s.nextLong();
			System.out.println("Enter contact group:");
			String inputGroup=s.next();
			Contact c1=Contact.createObject();
			c1.setName(inputName);
			c1.setNumber(inputNumber);
			c1.setGroup(inputGroup);
			
			
			Iterator<Contact> itr=hs.iterator();
			while(itr.hasNext()) {
				Contact citr1=itr.next();
				if(inputName.contentEquals(citr1.getName())) {
					System.out.println("Name must be unique,Give another name");
					addContact();
				}
			}
		
			if(hs.isEmpty()) {
				hs.add(c1);
				
			}
			
			
			
			else{
		hs.add(c1);
	}
			
			System.out.println("Contact has been successfully added");	
			System.out.println("===============================================");
			JavaMain.display();
			}
		
		
		public static void deleteContact() {
			System.out.println("Enter the name of contact to be deleted");
			String inputDeleteName=s.next();
			Iterator<Contact> itr1=hs.iterator();
			while(itr1.hasNext()) {
				Contact citr2=itr1.next();
				if(inputDeleteName.contentEquals(citr2.getName())) {
					
			hs.remove(citr2);
					System.out.println("Contact with name "+inputDeleteName+"has been deleted");
					
				}
				else {
					System.out.println("contact Name doesn't exist");
					return;
				}
			
			}
			System.out.println("===============================================");
			JavaMain.display();
		}
		public static void editContact() {
			System.out.println("enter the contact name to be edited:");
			String inputEditName=s.next();
			Iterator<Contact> itr2=hs.iterator();
			while(itr2.hasNext()) {
				Contact citr3=itr2.next();
				if(inputEditName.contentEquals(citr3.getName())) {
		
					System.out.println("Change contact name from "+citr3.getName()+" to : ");
					String editName=s.next();
					System.out.println("Change contact number from "+citr3.getNumber()+" to : ");
					long editNumber=s.nextLong();
					System.out.println("Change contact group from "+citr3.getGroup()+" to : ");
					String editGroup=s.next();
					Iterator<Contact> itr3=hs.iterator();
					while(itr3.hasNext()) {
						if(editName==itr3.next().getName()) {
							System.out.println("Name must be unique,Give another name");
							System.out.println("===============================================");
							
							addContact();
						}
						else {
							hs.add(citr3);					}
					}
					
		}
				else {
					System.out.println("invalid contact name");
					return;
				}
			}
			System.out.println("===============================================");
			
			JavaMain.display();
		}
			
		
		public static void showContact() {
			System.out.println("Contact names are:");
			Iterator<Contact> itr4=hs.iterator();
			while(itr4.hasNext()) {
				Contact citr=itr4.next();
					System.out.println(citr.getName()+":"+citr.getNumber());
				
			}
			System.out.println("===============================================");
			JavaMain.display();
		}
		public static void makeCall(String callName) {
			Iterator<Contact> itr5=hs.iterator();
			while(itr5.hasNext()) {
				 Contact citr5=itr5.next();
				if(callName.contentEquals(citr5.getName())) {
					
				System.out.println("calling "+callName+" having contact number:"+citr5.getNumber());
				}
				else {
					System.out.println("invalid contact name");
				}
				
					
				
		}
			
			System.out.println("===============================================");
			JavaMain.display();
			}
		
		public static void makeMessage(String messageName) {
			Iterator<Contact> itr6=hs.iterator();
			while(itr6.hasNext()) {
				Contact citr6=itr6.next();
				if(messageName.contentEquals(citr6.getName())) {
					System.out.println("Enter text message:");
					String msg=s.next();
				System.out.println("Sending the message "+"to "+messageName+"having contact number:"+citr6.getNumber());
				}
				else {
					System.out.println("invalid contact name");
					return;
				}
				
					
				
		}
			
			System.out.println("===============================================");
			JavaMain.display();
		}
		
		

}
