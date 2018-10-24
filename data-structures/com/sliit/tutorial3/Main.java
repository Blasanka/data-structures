package com.sliit.tutorial3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		LinkedList linkList = new LinkedList();
		Scanner userInputs = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter a number: ");
			linkList.insertLast(userInputs.nextInt());
		}
		
		System.out.print("\nInsert after(key): ");
		int key = userInputs.nextInt();
		
		System.out.print("\nInsert after(value): ");
		int afterValue = userInputs.nextInt();
		linkList.insertAfter(key, afterValue);
		
		linkList.displayList();
		
		System.out.print("\nDelete key: ");
		int deleteKey = userInputs.nextInt();
		
		//close the scanner to release the memory
		userInputs.close();
		
		if(linkList.delete(deleteKey)) {
			System.out.printf("\nAfter delete %d, list\n", deleteKey);
			linkList.displayList();
		} else {
			System.out.println("No matching element to delete");
		}
		
		linkList.deleteFirst();
		System.out.println("\nAfter delete first: ");
		linkList.displayList();

		//to delete last element easy method is to use Doubly LinkedList
//		linkList.deleteLast();
//		System.out.println("\nAfter delete last: ");
//		linkList.displayList();


		linkList.insertFirst(33);
		System.out.println("\nAfter insert to at first: ");
		linkList.displayList();
	}

}
