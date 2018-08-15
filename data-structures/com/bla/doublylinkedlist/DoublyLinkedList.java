package com.bla.doublylinkedlist;

public class DoublyLinkedList {

	private Link first;//or head
	private Link last;// or tail
	
	public DoublyLinkedList() {
		first = null;
	}
	
	//this is how I inserting at beginning
	public void insertFirst(int age) {
		Link newLink = new Link(age);

		newLink.next = first;
	    newLink.previous = null;
	 
	    if (first != null)
	    	first.previous = newLink;
	 
	    first = newLink;
	}
	
	
	public void displayListForword() {
		Link current = first;
		
		while (current != null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}
	
	public void displayListBackword(){
		Link current = last;
		
        while(current != null){
            current.displayLink();
            current = current.previous;
        }
        System.out.println();
    }
	
	public boolean isEmpty() {
		return first == null;
	}

}
