package com.dev.contact;


import java.util.HashMap;
import java.util.HashSet;

public class ContactList {
HashSet<Contact> cont1 = new HashSet<Contact>();
	
	
	public void addTo(Contact c){
		cont1.add(c);
		
	}
	int i = 1;
	public void getFrom(){
		for (Contact contact : cont1) {
			
			System.out.print(i++);
			System.out.print(" | "+contact.name);
			System.out.print(" | "+contact.number);
			System.out.print(" | "+contact.group);
			System.out.println();
		}
	}
	
	public void getFromByName(String name){
		
		String name1=name;
		for (Contact contact : cont1) {
			
			
			int i=1;
			
			if(name1.equals(contact.name))
			{
				System.out.print(i++);
				System.out.print(" | "+contact.name);
				System.out.print(" | "+contact.number);
				System.out.print(" | "+contact.group);
				System.out.println();
			}
		}
	}
	public void delFrom(Contact c){
		cont1.remove(c);
	}

	
	
	
}
