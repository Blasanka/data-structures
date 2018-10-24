package com.sliit.tutorial3;

public class LinkedList {

	Link first;
	
	public LinkedList() {
		this.first = null;
	}

	public boolean isEmpty() {
		return first == null;
	}
	
	public void displayList() {
		Link current = first;
		while (current != null) {
			System.out.println(current.iData);
			current = current.next;
		}
	}
	
	public boolean delete (int key) {
		Link deleteLink = first;
		Link previous = first;
		
		while (deleteLink != null && deleteLink.iData != key) {
			previous = deleteLink;
			deleteLink = deleteLink.next;
		}
		
		if (deleteLink != null) {
			if (first == deleteLink) {
				first = deleteLink.next;
			} else {
				previous.next = deleteLink.next;
			}
			return true;
		}
		return false;
	}
	
	public boolean insertAfter(int key, int newData) {
		Link link = first;
		
		while (link != null && key != link.iData) {
			link = link.next;
		}
		
		Link newLink = new Link(newData);
		
		if (first == null) {
			first = newLink;
			return true;
		} else {
			newLink.next = link.next;
			link.next = newLink;
			return true; // no point of doing this but lets thrill out
		}
	}
	
	public void insertFirst(int key) {
		Link newLink = new Link(key);
		newLink.next = first;
		first = newLink;
	}
	
	public void insertLast(int key) {
		Link current = first;
		Link lastLink = first;
		
		while (current != null && current.iData != key) {
			lastLink = current;
			current = current.next;
		}
		
		Link newLink = new Link(key);
		if (first == null) {
			first = newLink;
		} else {
			lastLink.next = newLink;
		}
	}
	
	public Link find(int key) {
		Link current = first;
		while (current != null && key != current.iData) {
			current = current.next;
		}
		
		return current;
	}
}
