package com.bla.linkedlist;

public class Link {

	public int lData;// these are data i'm going to use, you can add one or as many as you want.
	//this is to connect with next link/node
	Link next;
	
	public Link(int id) {
		this.lData = id;//this keyword can be avoided
		this.next = null;
	}
	
	public void displayLink() {
		System.out.println(lData);
	}
}
