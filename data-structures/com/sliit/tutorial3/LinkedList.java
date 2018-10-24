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
	
	public Link deleteFirst() {
		first = first.next;
		return first;
	}
	
//	public Link deleteLast() {
//		Link current = first;
//		Link previous = first;
//		
//		while (current != null) {
//			previous = current;
//			current = current.next;
//		}
//		
//		Link temp = previous;
//		previous = null;
//		return temp;
//	}
	
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
			if (link != null) {
				newLink.next = link.next;
				link.next = newLink;
				return true;
			} else {
				System.out.println("No matching key found");
				return false;
			}
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
		
		while (current != null) {
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
