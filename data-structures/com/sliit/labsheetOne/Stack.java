package com.sliit.labsheetOne;

//a) Implement Stack class to store characters. Identify the data members required and implement the below methods with the constructor. 
//Push(), Pop(), Peek(), isEmpty() and isFull()  

public class Stack {

	private int top;
	private int maxSize;
	
	private char[] stackArray;
	
	public Stack(int size) {
		maxSize = size;
		top = -1;
		
		stackArray = new char[maxSize];
	}
	
	public void push(char value) {
		if(isFull())
			System.out.println("Stack is full!");
		else
			stackArray[++top] = value;
	}
	
	public char pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty!");
			return '-';
		} else {
			return stackArray[top--];
		}
	}
	
	public char peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty!");
			return '-';
		} else {
			return stackArray[top];
		}
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == maxSize -1;
	}

}
