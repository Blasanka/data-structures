package com.bla.doublylinkedlist;

public class DoublyExampleMain {

	public static void main(String[] args) {
		
		DoublyLinkedList ageList = new DoublyLinkedList();
		
		ageList.insertFirst(23);
		ageList.insertFirst(22);
		ageList.insertFirst(44);
		ageList.insertFirst(53);
		
		ageList.displayListForword();
	}

}
