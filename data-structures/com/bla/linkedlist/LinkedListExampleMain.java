package com.bla.linkedlist;

public class LinkedListExampleMain {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insertFirst(5);
		list.insertFirst(234);
		list.insertFirst(71);
		
		list.displayList();
		
		list.deleteFirst();
		list.displayList();
	}

}
