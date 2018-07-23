package com.sliit.labsheetThree;

//Q1 (1.a)
//Implement Link class to store the name and average of a student. Identify the data
//attributes required and implement displayDetails() method with the constructor.

public class Link {
	public String stName;
	public double stAverage;
	public Link next;
	
	public Link(String name, double avg) {
		stName = name;
		stAverage = avg;
		next = null;
	}
	
	public void displayDetails() {
		System.out.println("Student Name: " + stName);
		System.out.println("Student average: " + stAverage);
	}
}
