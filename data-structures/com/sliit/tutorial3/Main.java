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
		
		System.out.print("Insert after(key): ");
		int key = userInputs.nextInt();
		
		System.out.print("Insert after(value): ");
		int afterValue = userInputs.nextInt();
		linkList.insertAfter(key, afterValue);
		
		linkList.displayList();
		
		System.out.print("Delete key: ");
		int deleteKey = userInputs.nextInt();
		if(linkList.delete(deleteKey)) {
			System.out.printf("After delete %d, list\n", deleteKey);
			linkList.displayList();
		} else {
			System.out.println("No matching element to delete");
		}
		

		//close the scanner to release the memory
		userInputs.close();
	}

}
