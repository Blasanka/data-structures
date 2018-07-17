package com.bla.stack;

import java.util.Scanner;

public class ExampleTwoMain {

	public static void main(String[] args) {
		
		int stackSize = 5;
		
		Stack userValueStack = new Stack(stackSize);
		
		Scanner getUserInput = new Scanner(System.in);
		
		for (int i = 0; i < stackSize; i++) {
			System.out.print("Enter a number: ");
			userValueStack.push(getUserInput.nextInt());
		}
		
		while(!userValueStack.isEmpty()) {
			System.out.printf("user input: %d ", userValueStack.pop()); 
		}
		
		getUserInput.close();
	}

}
