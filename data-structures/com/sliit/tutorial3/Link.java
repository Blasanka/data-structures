package com.sliit.tutorial3;

public class Link {

	public int iData;
	public Link next;
	
	public Link(int id) {
		this.iData = id;
		this.next = null;
	}
	
	public void displayLink() {
		System.out.println(iData);
	}

}
