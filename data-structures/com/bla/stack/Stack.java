package com.bla.stack;

//Note: java has in build Stack class that we can use. Since, we want to learn data structure this
//will help you.

//LIFO : Last In First Out
public class Stack {

	int maxSize;
	int top;
	
	//data type can be any but keep remember to change other places: String[] stArray;
	int[] stackArray;
	
	
	public Stack(int size) {
		maxSize = size;
		top = -1;
		
		//if data type is other than int you must change below line to String[size]
		stackArray = new int[size];
	}

	//If your data type is something else, change parameter type to match your data type
	public void push(int value) {
		//before add a value, we need to check whether stack is full or not
		if (isFull())
			System.out.println("Ops! Stack is full.");
		else
			stackArray[++top] = value;
	}

	//If your data type is something else, change return type to match your data type
	public int pop() {
		//before remove a value, we need to check whether stack is empty or not
		if (isEmpty()) {
			System.out.println("Ops! Stack is empty.");
			return -99;
		} else
			return stackArray[top--];
	}
	
	//If your data type is something else, change return type to match your data type
	public int peek() {
		//before remove a value, we need to check whether stack is empty or not
		if (isEmpty()) {
			System.out.println("Ops! Stack is empty.");
			return -99;
		} else {
			System.out.println(stackArray[top]);
			return stackArray[top];
		}
	}

	public boolean isFull() {
		return top == maxSize -1;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}

}
