package com.sliit.labsheetOne;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
//	b) Develop an application to  
//	 
//		i) Insert characters to the stack using push() method. 
		
		Stack characters = new Stack(5);
		
		characters.push('a');
		characters.push('b');
		characters.push('c');
		characters.push('d');
		
//		ii) Remove the content of the stack and display them. 
		while(!characters.isEmpty()) {
			System.out.println(characters.pop());
		}
		
//		iii) Comment on the order of insertion to the stack and the order of removal from the stack. 
			//LIFO, Firstly inserted value is removed last in other word lastly inserted value removed first.(Note: This is a my comment)
		
//		c) Use the stack class created above and check whether a user entered expression is correctly parenthesized.  
//		 
//		Ex:     3 + (( 6 * 2) – 3)    valid
//				5 * 6 + (2  - 5       not valid
		
		
		//Below is what I came up with, you may find different ways to do this. Suggest me if you have better solution.

//		c) Use the stack class created above and check whether a user entered expression is correctly parenthesized.  
//		 
//		Ex:     3 + (( 6 * 2) – 3)    valid
//				5 * 6 + (2  - 5       not valid
		
		//isBalanced() method implemented to check parenthesis
		if(isBalanced()) 
			System.out.println("valid");
		else
			System.out.println("not valid");
	}
	
	//better solution, isBalanced() implementation(not a must to implement method) 
	
	public static boolean isBalanced() {
		//Below is what I came up with, you may find different ways to do this. Suggest me if you have better solution.
		
		System.out.print("Enter a Expression: ");
		Scanner userInput = new Scanner(System.in);
		String insertedExp = userInput.nextLine();

		Stack expression = new Stack(insertedExp.length());
		
		for(int i =0; i < insertedExp.length(); i++) {
			char character = insertedExp.charAt(i);
			if (!expression.isFull() && '(' == character)
				expression.push(character);
			else if(character == ')') {
                if(expression.isEmpty() || expression.pop() != '(') {
                    return false;
                }
            }
		}
		
		//close the scanner
		userInput.close();
		return expression.isEmpty();
	}
	
	//below solution will fail/wrong for inputs like: )( and this is just a solution that you can implement without Stack
	
//	public static boolean isBalanced() {
//		Stack expression = new Stack(20);
//		
//		System.out.print("Enter a Expression: ");
//		Scanner userInput = new Scanner(System.in);
//		String insertedExp = userInput.nextLine();
//		
//		for(int i =0; i < insertedExp.length(); i++) {
//			expression.push(insertedExp.charAt(i));
//		}
//		
//		int count = 0;
//		while(!expression.isEmpty()) {
//			char character = expression.pop();
//			if ('(' == character)
//				count++;
//			else if (')' == character)
//				count--;
//		}
//		
//		if (count % 2 == 0) {
//			System.out.println("valid");
//			return true;
//		} else {
//			System.out.println("not valid");
//			return false;
//		}
//	}

}
