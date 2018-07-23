package com.sliit.labsheetTwo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		ii) Write a main program to create an object called mainQueue with 5 elements of the
//			QueueX class. This is used to store transactions IDs

		QueueX mainQueue = new QueueX(5);
		
//		iii) Allow the user to input 5 transaction IDs from the keyboard and store them in
//		printerQueue(this should be mainQueue not printerQueue).
		
		Scanner userInput = new Scanner(System.in);
		
		int index = 1; // if you use for loop this not needed
		while (!mainQueue.isFull()) {
			System.out.print("Enter transaction ID " + index + ": ");//or use printf()
			mainQueue.insert(userInput.nextInt());
			index++;
		}
		
//		iv) You are required to send these transactions to separate PCs based on the transaction
//		ID. Transactions sent to PC1 contains even transaction IDs and transactions sent to
//		PC2 contain odd IDs. Create two objects called evenQueue and oddQueue to store
//		these details. 
		
		QueueX oddQueue = new QueueX(5);
		QueueX evenQueue = new QueueX(5);
		
		while(!mainQueue.isEmpty()) {
			int tempValue = mainQueue.remove();
			if(tempValue % 2 == 0) {
				evenQueue.insert(tempValue);
				System.out.print("Id " + tempValue + " is sent to PC1");
			} else {
				oddQueue.insert(tempValue);
				System.out.println(" Id " + tempValue + " is sent to PC2");
			}
		}
		
//		v) Write the code to remove the numbers and display the result as follows.
		
		System.out.println("PC1\n");
		while (!evenQueue.isEmpty()) {
			System.out.println("Transaction " + evenQueue.remove());
		}
		
		System.out.println("PC2\n");
		while (!oddQueue.isEmpty()) {
			System.out.println("Transaction " + oddQueue.remove());
		}
	}

}
