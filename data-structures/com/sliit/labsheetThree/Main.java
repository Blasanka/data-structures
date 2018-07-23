package com.sliit.labsheetThree;

public class Main {

	public static void main(String[] args) {
		//Q1 (1.b) In an application, create three links with the following details.

//		Link st1 = new Link("Nipuna", 53.5);
//		Link st2 = new Link("Aravinda", 78.0);
//		Link st3 = new Link("Prashani", 69.5);
		
		//Q1 (1.c) Connect the three links as follows.
		
//		st1.next = st2;
//		st2.next = st3;
		
		//not needed, just to make sure

//		st1.displayDetails();
//		st2.displayDetails();
//		st3.displayDetails();
		
		/*Q1 ii) In your application, create the following link using the LinkList class and display the
		link details.*/
		
		LinkedList list = new LinkedList();
		list.insertFirst("Nipuna", 53.5);
		list.insertFirst("Aravinda", 78.0);
		list.insertFirst("Prashani", 69.5);
		
		//iii) Add more links to your link list.
		list.insertFirst("Daral", 99.9);
		
//		ii) Modify your application to delete a given link and display the details of the list.
		Link deletedLink = list.deleteLink("Nipuna");
		deletedLink.displayDetails();
		System.out.println("Deleted!\n");
		
		//just to make sure that the link is deleted!
		list.displayList();
	}

}
