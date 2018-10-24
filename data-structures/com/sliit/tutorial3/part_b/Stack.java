package com.sliit.tutorial3.part_b;

import com.sliit.tutorial3.Link;

public class Stack {

	//used the link of tutorial3 package
	private Link top;
	
	//Stack using LinkedList
	private LinkedList stackLinkedList;
	
	
	public Stack() {
		top = null;
		stackLinkedList = new LinkedList();
	}

	public void push(int value) {
		Link newLink = new Link(value);
		if (isEmpty()){
			newLink.next = null;
		} else {
			stackLinkedList.insertFirst(newLink);
			newLink.next = top;
		}
		top = newLink;
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Ops! Stack is empty.");
			return -99;
		} else {
			Link temp = top;
			top = top.next;
			return temp.iData;
		}
	}
	
	public int peek() {
		if (isEmpty()) {
			System.out.println("Ops! Stack is empty.");
			return -999;
		} else {
			Link temp = top;
			System.out.println(temp.iData);
			return temp.iData;
		}
	}
	
	public boolean isEmpty() {
		return top == null;
	}

}
