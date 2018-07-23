package com.sliit.labsheetThree;

//Q1 (b) i) Implement a LinkList class with the following data members and method
public class LinkedList {
	private Link first;
	
	public LinkedList() {
		first = null;
	}
	
	public void insertFirst(String name, double value) {
		Link newLink = new Link(name, value);
		newLink.next = first;
		first = newLink;
	}
	
	public Link deleteFirst() {
		Link temp = first;
		first = first.next;
		return temp;
	}
	
	public void displayList() {
		Link current = first;
		while(current != null) {
			System.out.println(current.stName + " " + current.stAverage);
			current = current.next;
		}
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
//	c) i) Modify your linkList class to add a new method called deleteLink(). This method will
//	find the link with the given name and delete the link.
	
	public Link deleteLink(String name) {
		Link current = first;
		Link previous = first;
		
		//find link
		while(current.stName != name) {
			if (current.next == null) {
				return null; // not found
			} else
				previous = current;
			current = current.next;
		}
		
		//delete it
		if(current == first)
			first = first.next;
		else
			previous.next = current.next;

		return current;
	}
}
