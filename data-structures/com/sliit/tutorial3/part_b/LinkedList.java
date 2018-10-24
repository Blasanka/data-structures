package com.sliit.tutorial3.part_b;

import com.sliit.tutorial3.Link;

public class LinkedList {
	
	private Link first;

	public LinkedList() {
		first = null;
	}
	
	public void insertFirst(Link newLink) {
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
