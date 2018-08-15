package com.bla.doublylinkedlist;

public class Link {

	public int age;
	public Link next;
	public Link previous;
	
	public Link(int age) {
		this.age = age;
		next = null;
		previous = null;
	}
	
	public void displayLink() {
		System.out.println(age);
	}

}
