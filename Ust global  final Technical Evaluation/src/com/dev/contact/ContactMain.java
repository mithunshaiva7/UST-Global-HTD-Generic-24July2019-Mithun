package com.dev.contact;

import java.util.Scanner;



public class ContactMain {

		public static void main(String[] args) {
			Contact con[] = new Contact[10];
			ContactList conlist = new ContactList();
			Scanner sc = new Scanner(System.in);
			con[0]= new Contact();
			con[1]= new Contact();
			con[2]= new Contact();
			con[3]= new Contact();
			con[4]= new Contact();
//			con[5]= new Contact();
//			con[6]= new Contact();
//			con[7]= new Contact();
			con[0].name="Mithun";
			con[0].number = 90988899;
			con[0].group = "Friend";
			
			con[1].name="Raj";
			con[1].number = 80988899;
			con[1].group = "Family";
			
			con[2].name="Ram";
			con[2].number =  8978999;
			con[2].group = "Friend";
			
			con[3].name="Nithin";
			con[3].number = 8888999;
			con[3].group = "Friend";
			
			con[4].name="Prakash";
			con[4].number =  9998999;
			con[4].group = "Friend";
			
			conlist.addTo(con[0]);
			conlist.addTo(con[1]);
			conlist.addTo(con[2]);
			conlist.addTo(con[3]);
			conlist.addTo(con[4]);
			
			System.out.println("Press 1 to Show all contact");
			System.out.println("Press 2 to search contact");
			System.out.println("Press 3 to Operate on contact");
			int opt = sc.nextInt();
			
			switch (opt) {
			case 1:
				conlist.getFrom();
				break;

			case 2:
				conlist.getFrom();
				System.out.println("Enter the name of contact");
				String nameToSearch = sc.next();
				conlist.getFromByName(nameToSearch);
				break;
				
			case 3:
				System.out.println("Press 1 to add contact");
				System.out.println("Press 2 to delete contact");
				System.out.println("Press 3 to edit contact");
				
				int option = sc.nextInt();
				switch (option) {
				case 1:
					int i = 5;
					con[i]= new Contact();
					
					System.out.println("Enter name");
					con[i].name=sc.next();
					System.out.println("Enter number");
					con[i].number=sc.nextLong();
					System.out.println("Enter group");
					con[i].group=sc.next();
					conlist.addTo(con[i]);
					System.out.println("Added SuccessFully");
					conlist.getFrom();
					i++;
					break;
					
					
				case 2:
					conlist.getFrom();
					System.out.println("Delete contact");
					System.out.println("Enter the index number you want to delete");
					int ind = sc.nextInt();
					conlist.delFrom(con[ind]);
					conlist.getFrom();
					
				case 3:
					conlist.getFrom();
					System.out.println("Enter the index you want to update");
					int ind1 = sc.nextInt();
					System.out.println("Enter name");
					con[ind1].name=sc.next();
					System.out.println("Enter number");
					con[ind1].number=sc.nextLong();
					System.out.println("Enter group");
					con[ind1].group=sc.next();
					conlist.addTo(con[ind1]);
					conlist.getFrom();
				default:
					break;
				}
			default:
				break;
			}
		}



	}
