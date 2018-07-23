package com.bla.linkedlist;

public class LinkedList {
	
	private Link first;

	public LinkedList() {
		first = null;
	}
	
	public void insertFirst(int data) {
		Link newLink = new Link(data);
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
			current.displayLink();
			current = current.next;
		}

		System.out.println("");
	}
	
	public boolean isEmpty() {
		return first == null;
	}

}
